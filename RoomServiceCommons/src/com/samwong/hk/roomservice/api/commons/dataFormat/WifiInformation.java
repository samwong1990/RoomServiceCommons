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
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof WifiInformation){
			return signalStrengths.equals(((WifiInformation) obj).getSignalStrengths());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// It's a set so I didn't bother with shifting.
		int xorAllSignalStrengths = 0;
		for(BssidStrength signalStrength : signalStrengths){
			xorAllSignalStrengths ^= signalStrength.hashCode();
		}
		return xorAllSignalStrengths;
	}
}
