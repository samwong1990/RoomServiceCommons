package hk.samwong.roomservice.commons.dataFormat;

import java.util.Collections;
import java.util.Set;

import net.sf.javaml.core.Instance;

public class Report {
	private String algorithm;
	private Label bestMatch;
	private Set<Label> otherCandidates = Collections.emptySet();
	private String notes;
	private Instance instance;

	public Report(Instance instance){
		this.instance = instance;
	}
	
	public String getAlgorithm() {
		return algorithm;
	}

	public Report setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
		return this;
	}

	public Label getBestMatch() {
		return bestMatch;
	}

	public Report setBestMatch(Label bestMatch) {
		this.bestMatch = bestMatch;
		return this;
	}

	public Set<Label> getOtherCandidates() {
		return otherCandidates;
	}

	public Report setOtherCandidates(Set<Label> otherCandidates) {
		this.otherCandidates = otherCandidates;
		return this;
	}

	public String getNotes() {
		return notes;
	}

	public Report setNotes(String notes) {
		this.notes = notes;
		return this;
	}

	public Instance getInstance() {
		return instance;
	}

	public Report setInstance(Instance instance) {
		this.instance = instance;
		return this;
	}

	@Override
	public String toString() {
		return String
				.format("Report [algorithm=%s, bestMatch=%s, otherCandidates=%s, notes=%s, instance=%s]",
						algorithm, bestMatch, otherCandidates, notes, instance);
	}

}
