package com.samwong.hk.roomservice.api.commons.dataFormat;

import com.samwong.hk.roomservice.api.commons.parameterEnums.ReturnCode;

public class Response {
	private ReturnCode returnCode = ReturnCode.OK; // only change this in exceptional case
	private String explanation;

	public Response(){}
	
	public ReturnCode getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(ReturnCode returnCode) {
		this.returnCode = returnCode;
	}

	public Response withReturnCode(ReturnCode returnCode) {
		this.returnCode = returnCode;
		return this;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	public Response withExplanation(String explanation) {
		this.explanation = explanation;
		return this;
	}
	
	@Override
	public String toString() {
		return "Response [returnCode=" + returnCode + ", explanation="
				+ explanation + "]";
	}
}
