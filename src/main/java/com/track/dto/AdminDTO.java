package com.track.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import com.track.entity.Candidate;

@Entity
@DiscriminatorValue("admin")
public class AdminDTO extends Candidate {
	
	@NotNull
	private String designation;
	
	public AdminDTO() {
		super();
	}

	public AdminDTO(@NotNull String designation) {
		super();
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "AdminDTO [designation=" + designation + "]";
	}	
	
	
	
}
