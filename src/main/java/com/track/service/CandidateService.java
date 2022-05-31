package com.track.service;

import java.util.List;

import com.track.entity.Candidate;
import com.track.exception.CandidateNotFoundException;

public interface CandidateService {
	public Candidate addCandidate(Candidate candidate);
	public Candidate viewCandidate(int userId) throws CandidateNotFoundException;
	public List<Candidate> viewCandidates();

}
