package com.track.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.track.entity.Candidate;
import com.track.entity.InterviewSchedule;
@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
	

}


