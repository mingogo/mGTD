package com.mteng.mongodb.util;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
// import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author khenry from CDS and modified by mteng
 * @date 
 */
public class PropertyUtil {

	// private static final Logger logger = Logger.getLogger(PropertyUtil.class.getName());

	private static PropertyUtil propertyUtil = null;
	private PropertiesConfiguration propertiesConfiguration = null;
	// private String environment = null;
	private String environment = "dev";

	private PropertyUtil() throws ConfigurationException {

		// 1. Look at the system properties, that overrides anything
		// Which is nothing, in this case.
		String systemPropertyEnvironment = System.getProperty("com.mteng.util.PropertyUtil.environment");
		if (systemPropertyEnvironment != null) {
			environment = systemPropertyEnvironment;
		}

		// 2. Look at the environment based on the server /docs/env file
		if (environment == null) {
			File env = new File("/docs/env");
			if (env.exists()) {
				Properties properties = new Properties();
				FileInputStream fis = null;
				try {
					fis = new FileInputStream(env);
					properties.load(fis);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						fis.close();
					} catch (Exception e) {
					}
				}
				environment = properties.getProperty("environment.name");
			}
		}

		// Third if no environment was selected make it local
		if (environment == null) {
			environment = "local";
		}

		// TODO: Should add logger into the project. 
		// logger.info("The current environment configurations are set for >" +  environment + "<");
		// logger.info("The current environment configurations are set for >{0}< environment : " + environment);

		if (environment.equals("dev")) {
			propertiesConfiguration = new PropertiesConfiguration("dev/fitch-rnp.properties");
		} else if (environment.equals("qa")) {
			propertiesConfiguration = new PropertiesConfiguration("qa/fitch-rnp.properties");
		} else if (environment.equals("prod")) {
			propertiesConfiguration = new PropertiesConfiguration("prod/fitch-rnp.properties");
		} else {
			propertiesConfiguration = new PropertiesConfiguration("local/fitch-rnp.properties");
		}
	}

	private PropertyUtil(File propertyFile) throws ConfigurationException {
		propertiesConfiguration = new PropertiesConfiguration(propertyFile);
	}

	public static synchronized PropertyUtil getInstance() {
		if (propertyUtil == null) {
			try {
				propertyUtil = new PropertyUtil();
			} catch (ConfigurationException ex) {
				// logger.error(null, ex);
			}
		}
		return propertyUtil;
	}

	public static synchronized PropertyUtil getClientInstance(File propertyFile) {
		if (propertyUtil == null) {
			try {
				propertyUtil = new PropertyUtil(propertyFile);
			} catch (ConfigurationException ex) {
				// logger.error(null, ex);
			}
		}
		return propertyUtil;
	}

	public String getEnvironment() {
		return environment;
	}

	public String[] getStringArray(String key) {
		return propertiesConfiguration.getStringArray(key);
	}

	public String getString(String key) {
		return propertiesConfiguration.getString(key);
	}

	public String getEntireString(String key) {
		String[] buffer = propertiesConfiguration.getStringArray(key);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < buffer.length; i++) {
			sb.append(buffer[i]);
			if (i != (buffer.length - 1)) {
				sb.append(",");
			}
		}
		return sb.toString();
	}

	public int getInt(String key) {
		return propertiesConfiguration.getInt(key);
	}
}