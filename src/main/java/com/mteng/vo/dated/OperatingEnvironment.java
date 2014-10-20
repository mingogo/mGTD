package com.mteng.vo.dated;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the OperatingEnvironment in Entity element
 * @author mingogo
 *
 */
public class OperatingEnvironment {
	private List<Object> factors = new ArrayList<Object>();

	public List<Object> getFactors() {
		return factors;
	}
	public void setFactors(List<Object> factorsTesting) {
		this.factors = factorsTesting;
	}
	private List<SubFactor> subFactors = new ArrayList<SubFactor>();

	public List<SubFactor> getSubFactors() {
		return subFactors;
	}
	public void setSubFactors(List<SubFactor> subFactors) {
		this.subFactors = subFactors;
	}
}