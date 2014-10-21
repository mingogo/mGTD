package com.mteng.vo.updatedJSON.builder;

import com.mteng.util.ObjectToJSON;
import com.mteng.vo.updatedJSON.MasterJSON;

public class JSONMasterBuilder {
	/**
	 * Build the master JSON. 
	 * @return Completed JSON, a regular POJO. 
	 */
	// public Object resultingJSON(){
	public String resultingJSONinString(){

		ObjectToJSON objectToJSON = new ObjectToJSON();
/*		MasterJSON masterJSON = new MasterJSON();
		EntityBuilder entityBuilder = new EntityBuilder();
		FinalRatingsBuilder finalRatingsBuilder  = new FinalRatingsBuilder();
		PeersBuilder peersBuilder = new PeersBuilder();

		masterJSON.setEntity(entityBuilder.result());
		masterJSON.setFinalRatings(finalRatingsBuilder.result());
		masterJSON.setPeers(peersBuilder.result());*/

		Object masterJSON = resultingJSONinObject();
		/**
		 * Convert the MasterJsonObject to JSON
		 */
		String output = (String) objectToJSON.convertedJSON(masterJSON);
		return output;
	}

	public Object resultingJSONinObject(){

		MasterJSON masterJSON = new MasterJSON();
		EntityBuilder entityBuilder = new EntityBuilder();
		FinalRatingsBuilder finalRatingsBuilder  = new FinalRatingsBuilder();
		PeersBuilder peersBuilder = new PeersBuilder();

		masterJSON.setEntity(entityBuilder.result());
		masterJSON.setFinalRatings(finalRatingsBuilder.result());
		masterJSON.setPeers(peersBuilder.result());

		return masterJSON;
	}
}