package com.track.dto;

public class CandidateDTO {
	
	
	private String candidateName;
	private int interviewSchedulID;
	private String primarySkils;
	private String secondarySkils;
	private float experience;
	private String qualification;
	private String designation;
	private float noticePeriod;
	private String location;
	private String status;
	public CandidateDTO() {
		super();
	}
	public CandidateDTO(String candidateName, int interviewSchedulID, String primarySkils, String secondarySkils,
			float experience, String qualification, String designation, float noticePeriod, String location,
			String status) {
		super();
		this.candidateName = candidateName;
		this.interviewSchedulID = interviewSchedulID;
		this.primarySkils = primarySkils;
		this.secondarySkils = secondarySkils;
		this.experience = experience;
		this.qualification = qualification;
		this.designation = designation;
		this.noticePeriod = noticePeriod;
		this.location = location;
		this.status = status;
	}
	@Override
	public String toString() {
		return "CandidateDTO [candidateName=" + candidateName + ", interviewSchedulID=" + interviewSchedulID + ", primarySkils="
				+ primarySkils + ", secondarySkils=" + secondarySkils + ", experience=" + experience
				+ ", qualification=" + qualification + ", designation=" + designation + ", noticePeriod=" + noticePeriod
				+ ", location=" + location + ", status=" + status + "]";
	}
	
	
	
	
}
