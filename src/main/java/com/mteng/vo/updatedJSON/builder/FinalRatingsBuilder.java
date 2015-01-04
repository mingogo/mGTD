package com.mteng.vo.updatedJSON.builder;

import java.util.ArrayList;
import java.util.List;

import com.mteng.vo.updatedJSON.FinalRating;

public class FinalRatingsBuilder {
	public List<FinalRating> result() {
		ArrayList<FinalRating> finalRatings = new ArrayList<FinalRating>(){

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
}
