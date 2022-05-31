package com.track.service;

import com.track.entity.InterviewSchedule;
import com.track.exception.CandidateNotFoundException;
import com.track.exception.InterviewScheduleNotFoundException;

public interface InterviewScheduleService {
	
	public  InterviewSchedule scheduleCandidateInterview(InterviewSchedule interviewSchedule);
	public  InterviewSchedule updateCandidateInterviewSchedule (InterviewSchedule interviewSchedule);
	public  InterviewSchedule cancelCandidateInterviewSchedule (int interviewScheduleID) throws InterviewScheduleNotFoundException ;
	public  InterviewSchedule giveRatingToCandidate(int interviewScheduleID) throws CandidateNotFoundException;	
}
