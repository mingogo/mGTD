package com.mteng.vo.updatedJSON;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"name",
	"operatingEnvironment",
	"businessProfile"
})

public class Peer {

	@JsonProperty("name")
	private String name;
	@JsonProperty("operatingEnvironment")
	private OperatingEnvironment_InsidePeers operatingEnvironment;
	@JsonProperty("businessProfile")
	private BusinessProfile_InsidePeer businessProfile;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("operatingEnvironment")
	public OperatingEnvironment_InsidePeers getOperatingEnvironment() {
		return operatingEnvironment;
	}

	@JsonProperty("operatingEnvironment")
	public void setOperatingEnvironment(OperatingEnvironment_InsidePeers operatingEnvironment) {
		this.operatingEnvironment = operatingEnvironment;
	}

	@JsonProperty("businessProfile")
	public BusinessProfile_InsidePeer getBusinessProfile() {
		return businessProfile;
	}

	@JsonProperty("businessProfile")
	public void setBusinessProfile(BusinessProfile_InsidePeer businessProfile) {
		this.businessProfile = businessProfile;
	}

}
