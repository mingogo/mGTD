package com.mteng.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;

/**
 * Converts the Object input to Jackson JSON object. 
 * @author mingogo
 *
 */
@Component
public class ObjectToJSON {
	public Object convertedJSON(Object input){

		ObjectMapper mapper = new ObjectMapper();
		Object output = null;

		try {
			/**
			 * Uncomment this if you want to write it to a file
			 */
			// mapper.writeValue(new File("/Users/mingogo/Desktop/user.json"), user);

			output = mapper.writeValueAsString(input);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// System.out.println(output);
		return output;
	};

	public String convertedJSON_inString(Object input) throws JsonGenerationException, JsonMappingException, IOException{

		ObjectMapper mapper = new ObjectMapper();
		Object output = null;

		output = mapper.writeValueAsString(input);
		String outputString = (String) output;

		return outputString;
	};
}
