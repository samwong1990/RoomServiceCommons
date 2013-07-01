package hk.samwong.roomservice.commons.dataFormat;

import java.util.Set;

public class Label {
	String UUID;
	String alias;
	String parentUUID;
	Set<String> childrenUUID;
	Set<WifiInformation> fingerprints;

	public String getUUID() {
		return UUID;
	}

	public Label setUUID(String uUID) {
		UUID = uUID;
		return this;
	}

	public String getAlias() {
		return alias;
	}

	public Label setAlias(String alias) {
		this.alias = alias;
		return this;
	}

	public String getParent() {
		return parentUUID;
	}

	public Label setParent(String parent) {
		this.parentUUID = parent;
		return this;
	}

	public Set<String> getChildren() {
		return childrenUUID;
	}

	public Label setChildren(Set<String> children) {
		this.childrenUUID = children;
		return this;
	}

	public Set<WifiInformation> getFingerprints() {
		return fingerprints;
	}

	public Label setFingerprints(Set<WifiInformation> fingerprints) {
		this.fingerprints = fingerprints;
		return this;
	}

	@Override
	public String toString() {
		return String
				.format("Label [UUID=%s, alias=%s, parent=%s, children=%s, fingerprints=%s]",
						UUID, alias, parentUUID, childrenUUID, fingerprints);
	}
}
