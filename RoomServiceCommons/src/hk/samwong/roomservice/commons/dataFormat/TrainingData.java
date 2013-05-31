package hk.samwong.roomservice.commons.dataFormat;

import java.util.Collections;
import java.util.List;

public class TrainingData {
	private List<WifiInformation> datapoints = Collections.emptyList();
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
	
	@Override
	public String toString() {
		return "TrainingData [datapoints=" + datapoints + ", room=" + room
				+ "]";
	}

}
