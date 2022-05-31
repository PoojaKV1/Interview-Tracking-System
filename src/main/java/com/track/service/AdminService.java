package com.track.service;

	import com.track.entity.Admin;
import com.track.exception.CandidateNotFoundException;


	public interface AdminService {

		public Admin addCandidate( Admin admin);

	    public Admin scheduleCandidateInterview( Admin admin);

		public Admin shareTheCandidateWithInterviewPanel( int userId) throws CandidateNotFoundException;

		
		
		
	}

