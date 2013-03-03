package com.samwong.hk.roomservice.api.commons.dataFormat;

public class BssidStrength {
	private String BSSID;
	private int level;

	public BssidStrength() {}
	
	public BssidStrength(String bssid, int level){
		this.BSSID = bssid;
		this.level = level;
	}
	
	public String getBSSID() {
		return BSSID;
	}

	public void setBSSID(String bSSID) {
		BSSID = bSSID;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "BssidStrength [BSSID=" + BSSID + ", level=" + level + "]";
	}
}
