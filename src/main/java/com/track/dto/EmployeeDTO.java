package com.track.dto;


import java.util.Objects;


import org.springframework.stereotype.Component;

import com.track.entity.User;

@Component
public class EmployeeDTO extends User {	
	
	
	private String type;
	
	private String location;
	

		
	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO( String type, String location ) {
		super();
		
		this.type = type;
		this.location = location;
	}

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, getName(), type);
	}

	

	@Override
	public String toString() {
		return "EmployeeDTO [ type=" + type + ", location=" + location + "]";
	}
			
}

