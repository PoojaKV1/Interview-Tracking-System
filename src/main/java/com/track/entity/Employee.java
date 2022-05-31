package com.track.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="employee")
public class Employee extends User {

	@NotNull
	private String type;

	@NotNull
	private String location;

	private boolean panelMember;

	public Employee() {
		super();
	}

	public Employee(@NotNull String type, @NotNull String location, boolean panelMember) {
		super();
		this.type = type;
		this.location = location;
		this.panelMember = panelMember;
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, panelMember, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(location, other.location) && panelMember == other.panelMember
				&& Objects.equals(type, other.type);
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

	public boolean isPanelMember() {
		return panelMember;
	}

	public void setPanelMember(boolean panelMember) {
		this.panelMember = panelMember;
	}

	@Override
	public String toString() {
		return "Employee [type=" + type + ", location=" + location + ", panelMember=" + panelMember + "]";
	}

}
