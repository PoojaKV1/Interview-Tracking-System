package com.track.exception;

public class EmployeeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1631823366296521859L;

	public EmployeeNotFoundException() {
	}

	public EmployeeNotFoundException(String message) {
		super(message);
	}
}