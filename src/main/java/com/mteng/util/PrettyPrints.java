package com.mteng.util;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.mongodb.DBObject;

public class PrettyPrints {

	public String resultingJson(DBObject input){
		ObjectToJSON objectToJSON = new ObjectToJSON();
		String json = (String) objectToJSON.convertedJSON(input);
		return resultingJson(json); 
	};

	public String resultingJson(JSONArray input){
		String jSONArray = input.toString();
		return resultingJson(jSONArray); 
	};

	public String resultingJson(JSONObject input){ 
		String in = input.toString();
		return resultingJson(in); 
	};

	public String resultingJson(String input){ 
		Object json = null;
		String indented = null;
		ObjectMapper mapper = new ObjectMapper();

		try {
			json = mapper.readValue(input, Object.class);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			indented = mapper.defaultPrettyPrintingWriter().writeValueAsString(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return indented;
	};
}
