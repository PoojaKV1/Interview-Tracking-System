package com.track.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.track.entity.InterviewSchedule;
import com.track.exception.InterviewScheduleNotFoundException;
import com.track.service.InterviewScheduleService;

@RestController
@CrossOrigin(origins = "")


public class InterviewScheduleController {

		@Autowired
		private InterviewScheduleService interviewScheduleService;
		
		
			@PostMapping(value="/Schedule")
			public InterviewSchedule ScheduleCandidateInterview(@RequestBody @Valid InterviewSchedule interviewSchedule ) {
			
				return interviewScheduleService.scheduleCandidateInterview(interviewSchedule);
			}
		
			

			@PutMapping(value="/update")
			public InterviewSchedule updateCandidateInterviewSchedule(@RequestBody @Valid InterviewSchedule interviewSchedule) {
				
				return interviewScheduleService.updateCandidateInterviewSchedule(interviewSchedule);
			}
			
			

			@DeleteMapping(value="/cancel/{id}")
			public InterviewSchedule cancelInterviewSchedule(@PathVariable("id") int interviewScheduleID) throws InterviewScheduleNotFoundException  {
				
				return interviewScheduleService.cancelCandidateInterviewSchedule(interviewScheduleID);
			}


}
