package com.workshop.service.exception;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -248476768187736752L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
}
