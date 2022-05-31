package com.track.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.track.dto.CandidateDTO;
import com.track.entity.Candidate;
import com.track.entity.InterviewSchedule;
import com.track.exception.CandidateNotFoundException;
import com.track.exception.InterviewScheduleNotFoundException;
import com.track.repository.CandidateRepository;
import com.track.repository.InterviewScheduleRepository;
import com.track.service.InterviewScheduleService;
import com.track.util.Converter;



@Service
public class InterviewScheduleServiceImpl implements InterviewScheduleService{
	
	
	@Autowired
	private CandidateRepository candidateRepo;
	@Autowired
	private InterviewScheduleRepository interviewScheduleRepo;

	@Override
	public  InterviewSchedule scheduleCandidateInterview(InterviewSchedule interviewSchedule) {
		
		// Candidate candidateObj= candidateRepo.save(candidate);
		
		//return Converter.covertToCandidateDTO( candidateRepo.save(candidate));
		return interviewScheduleRepo.save(interviewSchedule);
		
	}
		
	@Override
	public  InterviewSchedule updateCandidateInterviewSchedule(InterviewSchedule interviewSchedule) {
		
       // Candidate candidateObj= candidateRepo.save(candidate);
		
		// return Converter.covertToCandidateDTO( candidateRepo.save(candidate));
	
		return interviewScheduleRepo.save(interviewSchedule);
	}
	
	
	@Override
	public InterviewSchedule cancelCandidateInterviewSchedule(int interviewScheduleID) throws InterviewScheduleNotFoundException {
		
		
		Optional<InterviewSchedule> interviewSchedule = interviewScheduleRepo.findById(interviewScheduleID);
		
		InterviewSchedule interview = null;
		if(interviewSchedule.isPresent()) {
			interviewScheduleRepo.deleteById(interviewScheduleID);
			interview = interviewSchedule.get();
		}
		else {
			throw new InterviewScheduleNotFoundException("No such interview");
		}
		return interview;
	}
	
	
	@Override
	public InterviewSchedule giveRatingToCandidate(int interviewScheduleID) throws CandidateNotFoundException {
		
		return null;
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
