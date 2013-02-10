package com.samwong.hk.roomservice.api.commons.dataFormat;

import java.util.List;

public class ResponseWithReports extends Response{
	private List<Report> reports;
	
	public ResponseWithReports withReports(List<Report> reports){
		this.reports = reports;
		return this;
	}

	public List<Report> getReports() {
		return reports;
	}
	
}