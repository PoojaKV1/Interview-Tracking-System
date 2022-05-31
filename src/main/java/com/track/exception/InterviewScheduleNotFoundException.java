package com.track.exception;

public class InterviewScheduleNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2382300498570495555L;
	
	public InterviewScheduleNotFoundException() {
		
	}
	public InterviewScheduleNotFoundException(String message)
	{
		super(message);
	}

}
