package com.mteng.vo.updatedJSON.builder;

import java.util.ArrayList;
import java.util.List;

import com.mteng.util.ObjectToJSON;
import com.mteng.util.PrettyPrints;
import com.mteng.vo.updatedJSON.*;;

public class JSONMasterBuilder_AllInOne {

	/**
	 * The main method to run the all in one. 
	 * @param args
	 */
	public static void main(String[] args){

		PrettyPrints prettyPrints = new PrettyPrints();
		ObjectToJSON objectToJSON = new ObjectToJSON();

		JSONMasterBuilder_AllInOne JSONMaster = new JSONMasterBuilder_AllInOne();
		String output = (String) objectToJSON.convertedJSON(JSONMaster.resultingJSON());

		String Indentedoutput = (String) prettyPrints.resultingJson(output);
		System.out.println(Indentedoutput);
	}

	/**
	 * Build the OperatingEnvironment objects
	 * @return
	 */
	public OperatingEnvironment operatingEnvironmentBuilder(){
		OperatingEnvironment OEB = new OperatingEnvironment();
		OEB.setFactors(factorsBuilder());
		OEB.setSubFactors(subFactorsBuilder());
		return OEB;
	}

	/**
	 * Build the Subfactor objects
	 * @return
	 */
	private List<SubFactor> subFactorsBuilder() {

		List<SubFactor> subfactors = new ArrayList<SubFactor>(){

			{
				ArrayList<Option> options1 = new ArrayList<Option>(){

					{
						Option o1 = new Option();
						o1.setId(837456784356L);
						o1.setValue(3L);
						o1.setLabel("Description A");
						o1.setIsSelected(true);
						add(o1);

						Option o2 = new Option();
						o2.setId(837456784356L);
						o2.setValue(1L);
						o2.setLabel("Description B");
						o2.setIsSelected(false);
						add(o2);
					}
				};

				SubFactor sf1 = new SubFactor();
				sf1.setId(837456784356L);
				sf1.setRating(13L);
				sf1.setSelected(1L);
				sf1.setLabel("Economic Environment");
				sf1.setOptions(options1);
				add(sf1);

				ArrayList<Option> options2 = new ArrayList<Option>(){

					{
						Option o1 = new Option();
						o1.setId(837456784356L);
						o1.setValue(5L);
						o1.setLabel("Description");
						o1.setIsSelected(true);
						add(o1);

						Option o2 = new Option();
						o2.setId(837456784356L);
						o2.setValue(3L);
						o2.setLabel("Description available");
						o2.setIsSelected(false);
						add(o2);
					}
				};

				SubFactor sf2 = new SubFactor();
				sf2.setId(837456784356L);
				sf2.setRating(10L);
				sf2.setSelected(5L);
				sf2.setLabel("Something Else");
				sf2.setOptions(options2);
				add(sf2);
			}
		};

		return subfactors;
	}

	/**
	 * Build the factor objects
	 * @return
	 */
	private List<Object> factorsBuilder() {
		List<Object> factors = new ArrayList<Object>(){

			{
				FactorWithRatings f1 = new FactorWithRatings();
				f1.setId(837456784356L);
				f1.setLabel("Rating range High");
				f1.setRating(15L);

				FactorWithRatings f2 = new FactorWithRatings();
				f2.setId(837456784356L);
				f2.setLabel("Rating Range Low ");
				f2.setRating(6L);

				FactorWithInfluence f3 = new FactorWithInfluence();
				f3.setId(837456784356L);
				f3.setInfluence(1L);
				f3.setLabel("Influence");
				add(f1);
				add(f2);
				add(f3);
			}
		};
		return factors;
	}

	/**
	 * Built the Entity Object
	 * @return
	 */
	public Entity entityBuilder(){
		Entity entity = new Entity();
		entity.setName("This Company");
		entity.setOperatingEnvironment(operatingEnvironmentBuilder());
		entity.setBusinessProfile(businessProfileBuilder());
		return entity;
	}

	/**
	 * Build the business profile insides entity
	 * @return
	 */
	private BusinessProfile businessProfileBuilder() {

		BusinessProfile bp = new BusinessProfile();

		List<Object> factors = new ArrayList<Object>(){

			{
				FactorsWithMidPoint fwm1 = new FactorsWithMidPoint();
				fwm1.setId(837456784356L);
				fwm1.setMidPoint(15L);
				fwm1.setLabel("Rating range High");
				add(fwm1);

				// FactorsWithMidPoint fwm2 = new FactorsWithMidPoint();
				FactorWithInfluence fwm2 = new FactorWithInfluence();
				fwm2.setId(837456784356L);
				fwm2.setInfluence(2L);
				fwm2.setLabel("Influence");
				add(fwm2);
			}
		};

		List<Object> subFactors = new ArrayList<Object>(){

			{
				SubFactor_InsideBusinessProfile sfbp1 = new SubFactor_InsideBusinessProfile();
				sfbp1.setId(837456784356L);
				sfbp1.setRating(17L);
				sfbp1.setSelected(3L);
				sfbp1.setLabel("Management Strategy");

				ArrayList<Option> options1 = new ArrayList<Option>(){

					{
						Option o1 = new Option();
						o1.setId(837456784356L);
						o1.setValue(3L);
						o1.setLabel("Description A");
						o1.setIsSelected(true);
						add(o1);

						Option o2 = new Option();
						o2.setId(837456784356L);
						o2.setValue(1L);
						o2.setLabel("Description B");
						o2.setIsSelected(false);
						add(o2);
					}
				};
				sfbp1.setOptions(options1);
				add(sfbp1);

				SubFactor_InsideBusinessProfile sfbp2 = new SubFactor_InsideBusinessProfile();
				sfbp2.setId(837456784356L);
				sfbp2.setRating(20L);
				sfbp2.setSelected(3L);
				sfbp2.setLabel("Corporate Governance");

				ArrayList<Option> options2 = new ArrayList<Option>(){

					{
						Option o1 = new Option();
						o1.setId(837456784356L);
						o1.setValue(5L);
						o1.setLabel("Description");
						o1.setIsSelected(true);
						add(o1);

						Option o2 = new Option();
						o2.setId(837456784356L);
						o2.setValue(3L);
						o2.setLabel("Description available");
						o2.setIsSelected(false);
						add(o2);
					}
				};
				sfbp2.setOptions(options2);
				add(sfbp2);
			}
		};

		bp.setFactors(factors);
		bp.setSubFactors(subFactors);
		return bp;
	}

	private List<FinalRating> finalRatingsBuilder() {
		List<FinalRating> finalRatings = new ArrayList<FinalRating>(){

			{
				FinalRating fr1 = new FinalRating();
				fr1.setName("Current Rating");
				fr1.setRating("AA");

				FinalRating fr2 = new FinalRating();
				fr2.setName("Country Ceiling");
				fr2.setRating("A+");

				FinalRating fr3 = new FinalRating();
				fr3.setName("Factor Summary Observation (FSO)");
				fr3.setRating("0");

				add(fr1);
				add(fr2);
				add(fr3);
			}
		};
		return finalRatings;
	}

	private List<Peer> peersBuilder() {
		List<Peer> peers = new ArrayList<Peer>(){
			{
				Peer p1 = new Peer();
				p1.setName("Some other company");
				OperatingEnvironment_InsidePeers oe1 = new OperatingEnvironment_InsidePeers();
				oe1.setId(837456784356L);
				oe1.setRating(16L);
				oe1.setInfluence(3L);
				p1.setOperatingEnvironment(oe1);
				BusinessProfile_InsidePeer bp1 = new BusinessProfile_InsidePeer();
				bp1.setId(837456784356L);
				bp1.setRating(12L);
				bp1.setInfluence(3L);
				p1.setBusinessProfile(bp1);
				add(p1);

				Peer p2 = new Peer();
				p2.setName("Yet another company");
				OperatingEnvironment_InsidePeers oe2 = new OperatingEnvironment_InsidePeers();
				oe2.setId(837456784356L);
				oe2.setRating(14L);
				oe2.setInfluence(2L);
				p2.setOperatingEnvironment(oe2);

				BusinessProfile_InsidePeer bp2 = new BusinessProfile_InsidePeer();
				bp2.setId(837456784356L);
				bp2.setRating(11L);
				bp2.setInfluence(1L);
				p2.setBusinessProfile(bp2);
				add(p2);
			}};
			return peers;
	}

	public Object resultingJSON(){

		MasterJSON masterJSON = new MasterJSON();
		masterJSON.setEntity(entityBuilder());
		masterJSON.setPeers(peersBuilder());
		masterJSON.setFinalRatings(finalRatingsBuilder());

		return masterJSON;
	}
}