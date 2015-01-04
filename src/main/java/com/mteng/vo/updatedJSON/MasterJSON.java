package com.mteng.vo.updatedJSON;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"entity",
	"peers",
	"finalRatings"
})
public class MasterJSON {

	@JsonProperty("entity")
	private Entity entity;
	@JsonProperty("peers")
	private List<Peer> peers = new ArrayList<Peer>();
	@JsonProperty("finalRatings")
	private List<FinalRating> finalRatings = new ArrayList<FinalRating>();

	@JsonProperty("entity")
	public Entity getEntity() {
		return entity;
	}

	@JsonProperty("entity")
	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	@JsonProperty("peers")
	public List<Peer> getPeers() {
		return peers;
	}

	@JsonProperty("peers")
	public void setPeers(List<Peer> peers) {
		this.peers = peers;
	}

	@JsonProperty("finalRatings")
	public List<FinalRating> getFinalRatings() {
		return finalRatings;
	}

	@JsonProperty("finalRatings")
	public void setFinalRatings(List<FinalRating> finalRatings) {
		this.finalRatings = finalRatings;
	}
}