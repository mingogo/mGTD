package com.mteng.app;

import com.mteng.mongodb.dao.MongodbDAO;
import com.mteng.vo.gtd.builder.*;

public class AddDocuments {

	public static void main(String[] args){
		MongodbDAO mongodbDAO = new MongodbDAO();
		JSONMasterBuilder builder = new JSONMasterBuilder();

		mongodbDAO.addData((String) builder.resultingJSON());
		mongodbDAO.documentsCounter();
	};
}
