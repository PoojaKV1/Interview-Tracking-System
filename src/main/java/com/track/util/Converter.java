package com.track.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.track.dto.AdminDTO;
import com.track.dto.CandidateDTO;
import com.track.dto.EmployeeDTO;
import com.track.dto.InterviewScheduleDTO;
import com.track.dto.UserDTO;
import com.track.entity.Admin;
import com.track.entity.Candidate;
import com.track.entity.Employee;
import com.track.entity.InterviewSchedule;
import com.track.entity.User;

@Component
public class Converter {

//..................candidate.....................
	// converting DTO to Entity
	public static Candidate covertToCandidateEntity(CandidateDTO candidateDTO) {
		Candidate candidate = new Candidate();
		BeanUtils.copyProperties(candidateDTO, candidate);
		return candidate;
	}

	// converting Entity to DTO
	public static CandidateDTO covertToCandidateDTO(Candidate candidate) {
		CandidateDTO candidateDTO = new CandidateDTO();
		BeanUtils.copyProperties(candidate, candidateDTO);
		return candidateDTO;
	}

//.....................Admin..................
	public static Admin convertToadminEntity(AdminDTO adminDto) {
		Admin admin = new Admin();
		BeanUtils.copyProperties(adminDto, admin);
		return admin;
	}

	public static AdminDTO convertToAdminDTO(Candidate candidate) {
		AdminDTO adminDto = new AdminDTO();
		BeanUtils.copyProperties(candidate, adminDto);
		return adminDto;
	}

//.........................InterviewSchedule...........................	
	public static InterviewSchedule convertToInterviewScheduleEntity(InterviewScheduleDTO interviewScheduleDto) {
		InterviewSchedule interviewSchedule = new InterviewSchedule();
		BeanUtils.copyProperties(interviewScheduleDto, interviewSchedule);
		return interviewSchedule;
	}

	public static InterviewScheduleDTO convertToInterviewScheduleDTO(InterviewSchedule interviewSchedule) {
		InterviewScheduleDTO interviewScheduleDto = new InterviewScheduleDTO();
		BeanUtils.copyProperties(interviewSchedule, interviewScheduleDto);
		return interviewScheduleDto;
	}

	// .................user..........................
	public static User convertTouserEntity(UserDTO userDto) {
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		return user;
	}

	public static UserDTO convertToUserDTO(User user) {
		UserDTO userDTO = new UserDTO();
		BeanUtils.copyProperties(user, userDTO);
		return userDTO;
	}

	// ...................Employee.....................

	public static Employee convertToUserEntity(EmployeeDTO employeedto) {
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeedto, employee);
		return employee;
	}

	public static EmployeeDTO convertToEmployeeDTO(Employee employee) {
		EmployeeDTO employeedto = new EmployeeDTO();
		BeanUtils.copyProperties(employee, employeedto);
		return employeedto;
	}

	


}
