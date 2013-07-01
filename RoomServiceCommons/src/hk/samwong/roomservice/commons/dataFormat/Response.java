package hk.samwong.roomservice.commons.dataFormat;

import hk.samwong.roomservice.commons.parameterEnums.ReturnCode;

public class Response {
	private ReturnCode returnCode = ReturnCode.OK; // defaults to OK, only change this in exceptional case
	private String explanation;

	public Response(){}
	
	public ReturnCode getReturnCode() {
		return returnCode;
	}

	public Response setReturnCode(ReturnCode returnCode) {
		this.returnCode = returnCode;
		return this;
	}

	public String getExplanation() {
		return explanation;
	}

	public Response setExplanation(String explanation) {
		this.explanation = explanation;
		return this;
	}
	
	
	@Override
	public String toString() {
		return "Response [returnCode=" + returnCode + ", explanation="
				+ explanation + "]";
	}
}
