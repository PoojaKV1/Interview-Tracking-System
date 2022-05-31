package com.track.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="candidate")
public class Candidate extends User {

	@NotNull
	private String primarySkils;
	@NotNull
	private String secondarySkils;
	@Min(value = 2)
	@NotNull
	private float experience;
	@NotNull
	private String qualification;
	@NotNull
	private String designation;
	@NotNull
	private float noticePeriod;
	@NotNull
	private String location;
	@NotNull
	private String status;

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candidate(@NotNull String primarySkils, @NotNull String secondarySkils, @Min(2) @NotNull float experience,
			@NotNull String qualification, @NotNull String designation, @NotNull float noticePeriod,
			@NotNull String location, @NotNull String status) {
		super();

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
	public int hashCode() {
		return Objects.hash(designation, experience, location, noticePeriod, primarySkils, qualification,
				secondarySkils, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return Objects.equals(designation, other.designation)
				&& Float.floatToIntBits(experience) == Float.floatToIntBits(other.experience)
				&& Objects.equals(location, other.location)
				&& Float.floatToIntBits(noticePeriod) == Float.floatToIntBits(other.noticePeriod)
				&& Objects.equals(primarySkils, other.primarySkils)
				&& Objects.equals(qualification, other.qualification)
				&& Objects.equals(secondarySkils, other.secondarySkils) && Objects.equals(status, other.status);
	}

	public String getPrimarySkils() {
		return primarySkils;
	}

	public void setPrimarySkils(String primarySkils) {
		this.primarySkils = primarySkils;
	}

	public String getSecondarySkils() {
		return secondarySkils;
	}

	public void setSecondarySkils(String secondarySkils) {
		this.secondarySkils = secondarySkils;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(float noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Candidate [ primarySkils=" + primarySkils + ", secondarySkils=" + secondarySkils + ", experience="
				+ experience + ", qualification=" + qualification + ", designation=" + designation + ", noticePeriod="
				+ noticePeriod + ", location=" + location + ", status=" + status + "]";
	}

}