package com.samwong.hk.roomservice.api.commons.dataFormat;

import java.util.List;

public class TrainingData {
	private List<WifiInformation> datapoints;
	private String room;
	
	public TrainingData withRoom(String room){
		this.room = room;
		return this;
	}
	
	public String getRoom() {
		return room;
	}

	public List<WifiInformation> getDatapoints() {
		return datapoints;
	}

	public TrainingData withDatapoints(List<WifiInformation> datapoints) {
		this.datapoints = datapoints;
		return this;
	}

}
