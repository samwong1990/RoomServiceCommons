package com.samwong.hk.roomservice.api.commons.dataFormat;

import java.util.Set;

import net.sf.javaml.core.Instance;

public class Report{
	private String algorithm;
	private String room;
	private Set<String> otherCandidates;
	private String notes;
	private Instance instance;

	public Report(Instance instance) {
		this.instance = instance;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public Report withAlgorithm(String algorithmName) {
		this.algorithm = algorithmName;
		return this;
	}

	public Set<String> getCandidates() {
		return otherCandidates;
	}

	public void setOtherCandidates(Set<String> otherCandidates) {
		this.otherCandidates = otherCandidates;
	}

	public Report withCandidates(Set<String> otherCandidates) {
		this.otherCandidates = otherCandidates;
		return this;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public Report withRoom(String room) {
		this.room = room;
		return this;
	}

	public String getNotes() {
		return notes;
	}

	public Instance getInstance() {
		return instance;
	}

	public void setInstance(Instance instance) {
		this.instance = instance;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Report withNotes(String notes) {
		this.notes = notes;
		return this;
	}

	@Override
	public String toString() {
		return String.format("Room: %s, Notes: %s, Instance: %s", room, notes,
				instance);
	}

}
