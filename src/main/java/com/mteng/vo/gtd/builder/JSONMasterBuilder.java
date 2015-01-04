package com.mteng.vo.gtd.builder;

import com.mteng.util.ObjectToJSON;
import com.mteng.vo.gtd.*;

public class JSONMasterBuilder {

	public String resultingJSON_inString(){
		ObjectToJSON objectToJSON = new ObjectToJSON();
		Object masterJSON = resultingJSON_inObject();
		String output = (String) objectToJSON.convertedJSON(masterJSON);
		return output;
	}

	public Object resultingJSON_inObject(){
		MasterJSON masterJSON = new MasterJSON();
		masterJSON.setEntryName("Testing name");
		masterJSON.setEntryBody("Testing body.");
		return masterJSON;
	}
}
