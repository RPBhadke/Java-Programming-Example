package com.bloodconnect.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Donor")

public class Donor implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String DonorName;
	private Long Age;
	private String Gender;
	private String Address;
	private Long MobileNumber;
	private String Bloodgroup;
	private String Email;
	private String DonorUserId;
	private String DonorPassword;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDonorName() {
		return DonorName;
	}

	public void setDonorName(String donorName) {
		DonorName = donorName;
	}

	public Long getAge() {
		return Age;
	}

	public void setAge(Long age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Long getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getBloodgroup() {
		return Bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		Bloodgroup = bloodgroup;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDonorUserId() {
		return DonorUserId;
	}

	public void setDonorUserId(String donorUserId) {
		DonorUserId = donorUserId;
	}

	public String getDonorPassword() {
		return DonorPassword;
	}

	public void setDonorPassword(String donorPassword) {
		DonorPassword = donorPassword;
	}

	public Donor() {

	}

	public Donor(String DonorName, Long age, String Gender, String Address, Long MobileNumber, String Bloodgroup,
			String Email, String DonorUserId, String DonorPassword) {
		this.DonorName = DonorName;
		this.Age = age;
		this.Gender = Gender;
		this.Address = Address;
		this.MobileNumber = MobileNumber;
		this.Bloodgroup = Bloodgroup;
		this.Email = Email;
		this.DonorUserId = DonorUserId;
		this.DonorPassword = DonorPassword;

	}

}
