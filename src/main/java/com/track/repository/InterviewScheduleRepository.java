package com.track.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.track.entity.InterviewSchedule;

@Repository
public interface InterviewScheduleRepository extends JpaRepository<InterviewSchedule, Integer> {
	

}


