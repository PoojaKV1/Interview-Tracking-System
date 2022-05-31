package com.track.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class InterviewSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int interviewScheduleID;

	@Min(1)
	private float techRating;

	@Min(1)
	private float hRRating;

	@NotNull
	private String finalStatus;

	@NotNull
	private String rating;

	@NotNull
	private LocalDateTime interviewTime;

	@OneToOne
	@JoinColumn(name = "Candidate.userId")
	private Candidate candidate;
   
	@OneToMany(cascade = CascadeType.ALL)

	@JoinColumn(name = "Employee.userId")
	List<Employee> panel = new ArrayList<>();

	public InterviewSchedule() {
		super();
	}

	public InterviewSchedule(int interviewScheduleID, @Min(1) float techRating, @Min(1) float hRRating,
			@NotNull String finalStatus, @NotNull String rating, @NotNull LocalDateTime interviewTime,
			Candidate candidate,  List<Employee> panel) {
		super();
		this.interviewScheduleID = interviewScheduleID;
		this.techRating = techRating;
		this.hRRating = hRRating;
		this.finalStatus = finalStatus;
		this.rating = rating;
		this.interviewTime = interviewTime;
		this.candidate = candidate;
		this.panel = panel;
	}

	public int getInterviewScheduleID() {
		return interviewScheduleID;
	}

	public void setInterviewScheduleID(int interviewScheduleID) {
		this.interviewScheduleID = interviewScheduleID;
	}

	public float getTechRating() {
		return techRating;
	}

	public void setTechRating(float techRating) {
		this.techRating = techRating;
	}

	public float gethRRating() {
		return hRRating;
	}

	public void sethRRating(float hRRating) {
		this.hRRating = hRRating;
	}

	public String getFinalStatus() {
		return finalStatus;
	}

	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public LocalDateTime getInterviewTime() {
		return interviewTime;
	}

	public void setInterviewTime(LocalDateTime interviewTime) {
		this.interviewTime = interviewTime;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public List<Employee> getPanel() {
		return panel;
	}

	public void setPanel(List<Employee> panel) {
		this.panel = panel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(candidate, finalStatus, hRRating, interviewScheduleID, interviewTime, panel, rating,
				techRating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InterviewSchedule other = (InterviewSchedule) obj;
		return Objects.equals(candidate, other.candidate) && Objects.equals(finalStatus, other.finalStatus)
				&& Float.floatToIntBits(hRRating) == Float.floatToIntBits(other.hRRating)
				&& interviewScheduleID == other.interviewScheduleID
				&& Objects.equals(interviewTime, other.interviewTime) && Objects.equals(panel, other.panel)
				&& Objects.equals(rating, other.rating)
				&& Float.floatToIntBits(techRating) == Float.floatToIntBits(other.techRating);
	}

	@Override
	public String toString() {
		return "InterviewSchedule [interviewScheduleID=" + interviewScheduleID + ", techRating=" + techRating
				+ ", hRRating=" + hRRating + ", finalStatus=" + finalStatus + ", rating=" + rating + ", interviewTime="
				+ interviewTime + ", candidate=" + candidate + ", panel=" + panel + "]";
	}

	

}
