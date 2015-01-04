package com.mteng.vo.updatedJSON.builder;

import java.util.ArrayList;
import java.util.List;

import com.mteng.vo.updatedJSON.BusinessProfile_InsidePeer;
import com.mteng.vo.updatedJSON.OperatingEnvironment_InsidePeers;
import com.mteng.vo.updatedJSON.Peer;

public class PeersBuilder {

	public List<Peer> result(){
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
			};
		};
		return peers;
	}
}
