package com.track.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.track.entity.Candidate;
import com.track.exception.CandidateNotFoundException;
import com.track.repository.CandidateRepository;
import com.track.service.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService{
	
	@Autowired
	private CandidateRepository candidateRepo;

	@Override
	public Candidate addCandidate(Candidate candidate) {
		return candidateRepo.save(candidate);
	}

	@Override
	public Candidate viewCandidate(int userId) throws CandidateNotFoundException {
		
		Optional<Candidate> candidate = candidateRepo.findById(userId);
		Candidate candie = null;
		if(candidate.isPresent()) {
			candie = candidate.get();
		}else {
			throw new CandidateNotFoundException("No such candidate");
		}
		return candie;
	}
    
	@Override
	public List<Candidate> viewCandidates() {
		return candidateRepo.findAll();
	}

}

