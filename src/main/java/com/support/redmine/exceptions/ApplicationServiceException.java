package com.support.redmine.exceptions;

public class ApplicationServiceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String errCode;

	private String errMsg;

	public ApplicationServiceException(Exception ex) {
		super(ex);
	}
	
	public ApplicationServiceException(Exception ex,String errMsg) {
		super(ex);
		this.errMsg = errMsg;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}
