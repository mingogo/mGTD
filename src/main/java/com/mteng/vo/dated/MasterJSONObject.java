package com.mteng.vo.dated;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class MasterJSONObject {
	private Entity entity;
	private List<Peer> peers = new ArrayList<Peer>();

	@JsonProperty("Entity")
	public Entity getEntity() {
		return entity;
	}
	@JsonProperty("Peers")
	public List<Peer> getPeers() {
		return peers;
	}
	public void setEntity(Entity entity) {
		this.entity = entity;
	}
	public void setPeers(List<Peer> peers) {
		this.peers = peers;
	}
}