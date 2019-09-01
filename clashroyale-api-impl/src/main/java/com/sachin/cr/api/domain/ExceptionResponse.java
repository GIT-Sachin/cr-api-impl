package com.sachin.cr.api.domain;

public class ExceptionResponse {

	private Integer statusCode;
	private String reason;
	private String message;

	public String getMessage() {
		return message;
	}

	public String getReason() {
		return reason;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

}
