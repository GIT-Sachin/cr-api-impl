package com.sachin.cr.handlers.exception;

public class CRAPIException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CRAPIException(String exceptionMessage) {
		super(exceptionMessage);
	}

}
