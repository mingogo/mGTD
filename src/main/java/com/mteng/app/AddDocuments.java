package com.mteng.app;

import com.mteng.mongodb.dao.MongodbDAO;
import com.mteng.vo.updatedJSON.builder.*;

public class AddDocuments {

	public static void main(String[] args){
		MongodbDAO mongodbDAO = new MongodbDAO();

		// This is dated. 
		// MasterJsonObjectBuilder masterJsonObjectBuilder = new MasterJsonObjectBuilder();
		
		JSONMasterBuilder builder = new JSONMasterBuilder();

		/**
		 * Add the JSON composed by MasterJsonObjectBuilder according to Katherine's JSON.  
		 */
		mongodbDAO.addData((String) builder.resultingJSON());
		mongodbDAO.documentsCounter();
	};
}
