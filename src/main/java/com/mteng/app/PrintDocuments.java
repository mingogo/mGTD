package com.mteng.app;

import com.mteng.mongodb.dao.MongodbDAO;

/**
 * Print all documents in the collection and count it. 
 * @author mingogo
 */
public class PrintDocuments {

	public static void main(String[] args){
		MongodbDAO mongodbDAO = new MongodbDAO();
		mongodbDAO.printData();
		mongodbDAO.documentsCounter();
	};
}
