package com.mteng.vo.gtd;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
// @JsonPropertyOrder({ "entity", "peers", "finalRatings" })

public class MasterJSON {

	@JsonProperty("entryName")
	private String entryName;

	@JsonProperty("entryBody")
	private String entryBody;

	@JsonProperty("entryName")
	public String getEntryName() {
		return entryName;
	}

	@JsonProperty("entryName")
	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}

	@JsonProperty("entryBody")
	public String getEntryBody() {
		return entryBody;
	}

	@JsonProperty("entryBody")
	public void setEntryBody(String entryBody) {
		this.entryBody = entryBody;
	}

	// @JsonProperty("peers") private List<Peer> peers = new ArrayList<Peer>();

}