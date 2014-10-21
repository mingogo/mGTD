package com.mteng.mongodb.dao;

import java.awt.List;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mteng.mongodb.manager.MongodbConnectionManager;
import com.mteng.util.PrettyPrints;
import com.mongodb.util.JSON;

/**
 * The class MongodbDAO and get the instance from property files. 
 */
public class MongodbDAO {

	DBCollection coll = null; 
	PrettyPrints prettyPrints = new PrettyPrints();

	/**
	 * Instantiate the class MongodbDAO and get the instance from property files. 
	 */
	// TODO: Should make it changeable in deployment time. POM file and Maven build profile.  
	public MongodbDAO(){
		try{
			this.coll =  MongodbConnectionManager.getInstance().getCollectionUsingProperUtil();
			System.out.println("[Mongo]: Connection Established. ");
			System.out.println("[Mongo]: Connect to: " + coll.getFullName());
		} catch(Exception e) {
			e.printStackTrace();
			if(e != null){
				System.out.println("[Mongo]: Connection failed. ");
			}
		} 
	};

	public List fetchEntries(){
		List output = new List();
		DBCursor cursorDoc = coll.find();
		DBObject item = null;
		while (cursorDoc.hasNext()) { 
			// System.out.println(cursorDoc.next());
			item = cursorDoc.next();
			item.toString();
			output.add(item.toString());
		}
		return output;
	}

	/**
	 * List the documents in MongoLab. User choose if the documents are pretty printed. Default is not. 
	 * @param isPrettyPrinted
	 */
	public void printData(Boolean isPrettyPrinted){

		System.out.println("[Mongo]: Printing....\n"); 

		DBCursor cursorDoc = coll.find();

		if (isPrettyPrinted){
			while (cursorDoc.hasNext()) { 
				System.out.println(prettyPrints.resultingJson(cursorDoc.next()));
			}
		}else{
			while (cursorDoc.hasNext()) { 
				System.out.println(cursorDoc.next());
			}
		}

		System.out.println("[Mongo]: Done."); 
	}

	/**
	 * List the documents in MongoLab. If the parameter is blank then it will not be pretty printed. 
	 */
	public void printData(){
		printData(false);
	}

	/**
	 * Add one document (JSON String) to the collection. 
	 * @param inputJSON
	 */
	public void addData(String inputJSON){
		DBObject dbObject = (DBObject) JSON.parse(inputJSON);
		coll.insert(dbObject);
		System.out.println("[Mongo]: Document Inserted.\n"); 
	}

	/**
	 * Add one document (MongoDB Object) to the collection. 
	 * @param inputDBObject
	 */
	public void addData(DBObject inputDBObject){
		coll.insert(inputDBObject);
		System.out.println("[Mongo]: Document Inserted.\n"); 
	}

	/**
	 * Count the documents in that collection. 
	 */
	public Integer documentsCounter(){
		DBCursor cursorDoc = coll.find();
		Integer counter = 0;

		while (cursorDoc.hasNext()) { 
			cursorDoc.next();
			counter++;
		}
		System.out.println("[Mongo]: Total Documents: " + counter); 
		return counter;
	}
}