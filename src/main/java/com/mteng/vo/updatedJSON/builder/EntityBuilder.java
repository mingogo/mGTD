package com.mteng.vo.updatedJSON.builder;

import java.util.ArrayList;
import java.util.List;

import com.mteng.vo.updatedJSON.BusinessProfile;
import com.mteng.vo.updatedJSON.Entity;
import com.mteng.vo.updatedJSON.FactorWithInfluence;
import com.mteng.vo.updatedJSON.FactorWithRatings;
import com.mteng.vo.updatedJSON.FactorsWithMidPoint;
import com.mteng.vo.updatedJSON.OperatingEnvironment;
import com.mteng.vo.updatedJSON.Option;
import com.mteng.vo.updatedJSON.SubFactor;
import com.mteng.vo.updatedJSON.SubFactor_InsideBusinessProfile;

/**
 * Build the "Entity" part of the JSON.
 * @author mteng
 *
 */
public class EntityBuilder {
	private BusinessProfile businessProfileBuilder() {

		BusinessProfile bp = new BusinessProfile();

		List<Object> factors = new ArrayList<Object>(){
			{
				FactorsWithMidPoint fwm1 = new FactorsWithMidPoint();
				fwm1.setId(837456784356L);
				fwm1.setMidPoint(15L);
				fwm1.setLabel("Rating range High");
				add(fwm1);

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
	 * Build the OperatingEnvironment objects
	 * @return
	 */
	public OperatingEnvironment operatingEnvironmentBuilder(){
		OperatingEnvironment OEB = new OperatingEnvironment();
		OEB.setFactors(factorsBuilder());
		OEB.setSubFactors(subFactorsBuilder());
		return OEB;
	}

	private List<Object> factorsBuilder() {
		ArrayList<Object> factors = new ArrayList<Object>(){

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

	public Entity result(){
		Entity entity = new Entity();
		entity.setName("This Company");
		entity.setOperatingEnvironment(operatingEnvironmentBuilder());
		entity.setBusinessProfile(businessProfileBuilder());
		return entity;
	};
}