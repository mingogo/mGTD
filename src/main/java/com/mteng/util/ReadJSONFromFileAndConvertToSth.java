package com.mteng.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mteng.util.PrettyPrints;

public class ReadJSONFromFileAndConvertToSth {

	PrettyPrints prettyPrints = new PrettyPrints();
	private String jsonFileLocation = "/Users/mingogo/Desktop/newjson.json";

	public String getJsonFileLocation() {
		return jsonFileLocation;
	}

	public void setJsonFileLocation(String jsonFileLocation) {
		this.jsonFileLocation = jsonFileLocation;
	}

	/**
	 * Read JSON from file and return the resulting JSON String.
	 * @return Resulting JSON String. 
	 */
	public String outputInputJSON(){

		JSONParser parser = new JSONParser();
		JSONObject jsonObject = null;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader(jsonFileLocation));
/*		} catch (IOException | ParseException e) {*/
		} catch (Exception e) {
			e.printStackTrace();
		}

		String input = jsonObject.toJSONString();

		// String indented = prettyPrints.resultingJson(input);
		// System.out.println("\n" + "InputJSON, location: " + jsonFileLocation + "\n");
		// System.out.println(indented);

		return input;
	};

	/**
	 * Convert the JSON from file to JSONObject (Jackson)
	 * @param inputFileLocation
	 * @return JSONObject
	 */
	public JSONObject outputInputJSON(String inputFileLocation){

		JSONParser parser = new JSONParser();
		JSONObject jsonObject = null;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader(inputFileLocation));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		/**
		 * Uncomment this if you want to pretty print
		String input = jsonObject.toJSONString();
		String indented = prettyPrints.resultingJson(input);
		System.out.println("\n" + "InputJSON, location: " + jsonFileLocation + "\n");
		System.out.println(indented);
		 */

		// return input;
		return jsonObject;
	};
}