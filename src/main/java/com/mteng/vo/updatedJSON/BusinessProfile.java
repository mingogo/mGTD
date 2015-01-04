
package com.mteng.vo.updatedJSON;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"factors",
	"subFactors"
})
public class BusinessProfile {

	@JsonProperty("factors")
	private List<Object> factors = new ArrayList<Object>();
	@JsonProperty("subFactors")
	private List<Object> subFactors = new ArrayList<Object>();

	@JsonProperty("factors")
	public List<Object> getFactors() {
		return factors;
	}

	@JsonProperty("factors")
	public void setFactors(List<Object> factors) {
		this.factors = factors;
	}

	@JsonProperty("subFactors")
	public List<Object> getSubFactors() {
		return subFactors;
	}

	@JsonProperty("subFactors")
	public void setSubFactors(List<Object> subFactors) {
		this.subFactors = subFactors;
	}

	public BusinessProfile withSubFactors(List<Object> subFactors) {
		this.subFactors = subFactors;
		return this;
	}
}
