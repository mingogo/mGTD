package com.mteng.mongodb.manager;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mteng.mongodb.util.PropertyUtil;

/**
 * 
 * @author Hao, modified by mteng
 *
 */
public class MongodbConnectionManager {

	/**
	 * Make it a Singleton
	 */
	private static final MongodbConnectionManager INSTANCE = new MongodbConnectionManager();
	private MongodbConnectionManager(){}
	public static MongodbConnectionManager getInstance(){return INSTANCE; }

	public DBCollection getCollection(){
		DBCollection dBCollection = null;
		try{
			// MongoClientURI uri  = new MongoClientURI("mongodb://user:pass@host:port/db");
			// MongoClientURI uri  = new MongoClientURI("mongodb://mongo-ids-usr:ids@mongoids-d01:27017/ids-dev-2");
			MongoClientURI uri  = new MongoClientURI("mongodb://mteng:1234@ds033740.mongolab.com:33740/mongodb"); 
			MongoClient client = new MongoClient(uri);
			DB db = client.getDB(uri.getDatabase());

			// if collection doesn't exists, MongoDB will create it for you
			dBCollection = db.getCollection("fitchRatingsNavPlus_TestColl");
		} catch(Exception e) {
			e.printStackTrace();
		} 

		return dBCollection;
	}

	public DBCollection getCollectionUsingProperUtil(){

		DBCollection dBCollection = null;
		PropertyUtil propertyUtil = PropertyUtil.getInstance();

		Integer databasePort = propertyUtil.getInt("mongo.database.port");
		String databaseUsername = propertyUtil.getString("mongo.database.username");
		String databasePassword = propertyUtil.getString("mongo.database.password");
		String databaseHost = propertyUtil.getString("mongo.database.host");
		String databaseInstance = propertyUtil.getString("mongo.database.instance");
		String databaseCollection = propertyUtil.getString("mongo.database.collection");

		try{

			MongoClientURI uri  = new MongoClientURI("mongodb://" + databaseUsername +
			":" + databasePassword + "@" + databaseHost + ":" + databasePort + "/" +
			databaseInstance);

			MongoClient client = new MongoClient(uri);
			DB db = client.getDB(uri.getDatabase());
			dBCollection = db.getCollection(databaseCollection);

		} catch(Exception e) {
			e.printStackTrace();
		} 
		return dBCollection;
	}

	public DBCollection getCollection(String user, String password, String host, int port, String instance, String collection){

		DBCollection dBCollection = null;
		try{

			MongoClientURI uri  = new MongoClientURI("mongodb://" + user + ":" + password
					+ "@" + host + ":" + port + "/" + instance);

			MongoClient client = new MongoClient(uri);
			DB db = client.getDB(uri.getDatabase());
			dBCollection = db.getCollection(collection);

		} catch(Exception e) {
			e.printStackTrace();
		} 
		return dBCollection;
	}
}