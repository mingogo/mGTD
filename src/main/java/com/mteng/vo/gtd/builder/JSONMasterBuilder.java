package com.mteng.vo.gtd.builder;

import com.mteng.util.ObjectToJSON;
import com.mteng.vo.gtd.*;

public class JSONMasterBuilder {
	public String resultingJSON(){

		MasterJSON masterJSON = new MasterJSON();
/*		EntityBuilder entityBuilder = new EntityBuilder();
		FinalRatingsBuilder finalRatingsBuilder  = new FinalRatingsBuilder();
		PeersBuilder peersBuilder = new PeersBuilder();*/
		ObjectToJSON objectToJSON = new ObjectToJSON();

		masterJSON.setEntryName("TEsting name");
		masterJSON.setEntryBody("Testing body.");
/*		masterJSON.setEntity(entityBuilder.result());
		masterJSON.setFinalRatings(finalRatingsBuilder.result());
		masterJSON.setPeers(peersBuilder.result());*/

		/**
		 * Convert the MasterJsonObject to JSON
		 */
		String output = (String) objectToJSON.convertedJSON(masterJSON);
		return output;
	}
}
