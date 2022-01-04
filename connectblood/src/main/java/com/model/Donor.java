package com.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "Donor_table")
public class Donor {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String donorName;
	private int age;
	private String gender;
	private String address;
	private Long mobileNumber;
	private String bloodgroup;
	private String email;
	private String donorUserId;
	private String donorPassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDonorUserId() {
		return donorUserId;
	}
	public void setDonorUserId(String donorUserId) {
		this.donorUserId = donorUserId;
	}
	public String getDonorPassword() {
		return donorPassword;
	}
	public void setDonorPassword(String donorPassword) {
		this.donorPassword = donorPassword;
	}
	
	public Donor(String donorName, int age, String gender, String address, Long mobileNumber, String bloodgroup,
			String email, String donorUserId, String donorPassword) {
		this.donorName = donorName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.bloodgroup = bloodgroup;
		this.email = email;
		this.donorUserId = donorUserId;
		this.donorPassword = donorPassword;

	
	}
	public Donor() {
		// TODO Auto-generated constructor stub
	}
	
	
	}
