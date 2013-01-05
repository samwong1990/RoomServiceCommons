package com.samwong.hk.roomservice.api.commons.dataFormat;

import java.util.Set;

public class WifiInformation {
	private Set<BssidStrength> signalStrengths;
	private String room;
	private String notes;
	
	public WifiInformation(){}
	
	public WifiInformation withSignalStrengths(Set<BssidStrength> signalStrengths){
		this.signalStrengths = signalStrengths;
		return this;
	}
	
	public WifiInformation withRoom(String room){
		this.room = room;
		return this;
	}
	
	public WifiInformation withNotes(String notes){
		this.notes = notes;
		return this;
	}
	
	public Set<BssidStrength> getSignalStrengths() {
		return signalStrengths;
	}

	public String getRoom() {
		return room;
	}

	public String getNotes() {
		return notes;
	}
	
	@Override
	public String toString() {
		return String.format("Room: %s, Notes: %s, SignalStrengths %s", room, notes, signalStrengths.toString());
	}
}
