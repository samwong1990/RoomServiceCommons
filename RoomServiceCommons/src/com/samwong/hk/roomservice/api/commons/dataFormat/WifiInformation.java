package com.samwong.hk.roomservice.api.commons.dataFormat;

import java.util.Collections;
import java.util.Set;

public class WifiInformation {
	private Set<BssidStrength> signalStrengths = Collections.emptySet();
	private String notes;
	
	public WifiInformation(){}
	
	public WifiInformation withSignalStrengths(Set<BssidStrength> signalStrengths){
		this.signalStrengths = signalStrengths;
		return this;
	}
	
	public WifiInformation withNotes(String notes){
		this.notes = notes;
		return this;
	}
	
	public Set<BssidStrength> getSignalStrengths() {
		return signalStrengths;
	}

	public String getNotes() {
		return notes;
	}
	
	@Override
	public String toString() {
		return "WifiInformation [signalStrengths=" + signalStrengths
				+ ", notes=" + notes + "]";
	}
}
