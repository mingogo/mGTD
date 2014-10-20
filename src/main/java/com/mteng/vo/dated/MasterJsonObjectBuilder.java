package com.mteng.vo.dated;

import java.util.ArrayList;
import java.util.List;

import com.mteng.util.ObjectToJSON;
import com.mteng.util.PrettyPrints;

/**
 * This class builds the JSON according to Katherine. 
 * Note: this is dated. Refer to the package com.mteng.vo.updatedJSON for new one. 
 * @author mingogo
 */
public class MasterJsonObjectBuilder {

	public static void main(String[] args){
		MasterJsonObjectBuilder masterJsonObjectBuilder = new MasterJsonObjectBuilder();
		masterJsonObjectBuilder.resultingJSON();
	};

	public String resultingJSON(){

		ObjectToJSON objectToJSON = new ObjectToJSON();
		PrettyPrints prettyPrints = new PrettyPrints();
		MasterJSONObject masterJsonObject = new MasterJSONObject();
		Entity entity = new Entity();
		OperatingEnvironment operatingEnvironment = new OperatingEnvironment();

		/**
		 * Build the MasterJsonObject
		 */

		final List<Option> options1 = new ArrayList<Option>(){

			{
				Option option1 = new Option();
				option1.setId(837456784356L);
				option1.setValue(3L);
				option1.setLabel("Description A");
				option1.setIsSelected(true);

				Option option2 = new Option();
				option2.setId(837456784356L);
				option2.setValue(1L);
				option2.setLabel("Description B");
				option2.setIsSelected(false);

				add(option1);
				add(option2);
			}
		};

		final List<Option> options2 = new ArrayList<Option>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				Option option1a = new Option();
				option1a.setId(837456784356L);
				option1a.setValue(5L);
				option1a.setLabel("Description");
				option1a.setIsSelected(true);

				Option option2b = new Option();
				option2b.setId(837456784356L);
				option2b.setValue(3L);
				option2b.setLabel("Description available");
				option2b.setIsSelected(false);

				add(option1a);
				add(option2b);
			}
		};

		List<Object> factors = new ArrayList<Object>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				FactorWithRatings factor1 = new FactorWithRatings();
				factor1.setId(837456784356L);
				factor1.setRating(15L);
				factor1.setLabel("Rating Range High");

				FactorWithRatings factor2 = new FactorWithRatings();
				factor2.setId(837456784356L);
				factor2.setRating(6L);
				factor2.setLabel("Rating Range Low");

				FactorWithInfluence factor3 = new FactorWithInfluence();
				factor3.setId(837456784356L);
				factor3.setInfluence(1L);
				factor3.setLabel("Influence");

				add(factor1);
				add(factor2);
				add(factor3);
			}
		};

		List<SubFactor> subFactors = new ArrayList<SubFactor>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				SubFactor subfactor1 = new SubFactor();
				subfactor1.setId(837456784356L);
				subfactor1.setRating(13L);
				subfactor1.setSelected(1L);
				subfactor1.setLabel("Economic Environment");
				subfactor1.setOptions(options1);
				add(subfactor1);

				SubFactor subfactor2 = new SubFactor();
				subfactor2.setId(837456784356L);
				subfactor2.setSelected(5L);
				subfactor2.setRating(10L);
				subfactor2.setLabel("Something Else");
				subfactor2.setOptions(options2);
				add(subfactor2);
			}
		};

		operatingEnvironment.setFactors(factors);
		operatingEnvironment.setSubFactors(subFactors);

		entity.setName("This Company");
		entity.setOperatingEnvironment(operatingEnvironment);

		List<Peer> peers = new ArrayList<Peer>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				Peer peer1 = new Peer();
				peer1.setName("Some other company");
				OperatingEnvironment_ peerOperatingEnviroment1 = new OperatingEnvironment_();;
				peerOperatingEnviroment1.setId(837456784356L);
				peerOperatingEnviroment1.setRating(16L);
				peerOperatingEnviroment1.setInfluence(3L);
				peer1.setOperatingEnvironment(peerOperatingEnviroment1);

				Peer peer2 = new Peer();
				peer2.setName("Yet another company");
				OperatingEnvironment_ peerOperatingEnviroment2 = new OperatingEnvironment_();
				peerOperatingEnviroment2.setId(837456784356L);
				peerOperatingEnviroment2.setRating(14L);
				peerOperatingEnviroment2.setInfluence(2L);
				peer2.setOperatingEnvironment(peerOperatingEnviroment2);

				add(peer1);
				add(peer2);
			}
		};

		masterJsonObject.setEntity(entity);
		masterJsonObject.setPeers(peers);

		/**
		 * Convert the MasterJsonObject to JSON
		 */
		String output = (String) objectToJSON.convertedJSON(masterJsonObject);

		/**
		 * Pretty print the result
		 */
		String Indentedoutput = (String) prettyPrints.resultingJson(output);
		System.out.println(Indentedoutput);

		return output;
	}
}