package hk.samwong.roomservice.commons.dataFormat;

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
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BssidStrength){
			return BSSID.equals(((BssidStrength) obj).getBSSID()) && level == ((BssidStrength) obj).getLevel();
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return BSSID.hashCode() ^ level; 
	}
}
