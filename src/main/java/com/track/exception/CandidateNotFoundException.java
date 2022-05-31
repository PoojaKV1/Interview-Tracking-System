package com.track.exception;

public class CandidateNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -2446153442582965706L;
	
	public CandidateNotFoundException() {
		
	}
	
	public CandidateNotFoundException(String message) {
		super(message);
	}

}
