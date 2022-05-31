package com.track.dto;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table (name="users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name="user_type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("user")
public class UserDTO {
    
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int userId;
	@NotNull
	private String name;
	@NotNull
	private String gender;
    
	@NotNull
	private String houseNo;
	@NotNull
	private String city;
	@NotNull
	private String state;
	@NotNull
	private String pinCode;
	@NotNull
	private String dob;
    
	@NotNull
	private String qualification;
	@Min(value = 2)
	@NotNull
	private float experience;
	
	@NotNull
	private String userName;
	@NotNull
	private String password;

	public UserDTO() {
		super();
	}

	public UserDTO(int userId, String name, String gender, String houseNo, String city, String state, String pinCode,
			String dob, String qualification, float experience, String userName, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.gender = gender;
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.dob = dob;
		this.qualification = qualification;
		this.experience = experience;
		this.userName = userName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", gender=" + gender + ", houseNo=" + houseNo + ", city="
				+ city + ", state=" + state + ", pinCode=" + pinCode + ", dob=" + dob + ", qualification="
				+ qualification + ", experience=" + experience + ", userName=" + userName + ", password=" + password
				+ "]";
	}

}
