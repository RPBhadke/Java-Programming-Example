
package com.bloodconnect.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Recipient")

public class Recipient implements Serializable{
	@Id @GeneratedValue
	 private Long id;
    private String RecipientName;
    private String  Age;
    private String Gender;
    private String Address;
    private String  MobileNumber;
    private String Bloodgroup;
	private String Email;
    private String RecipientUserId;
    private String RecipientPassword;
    
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRecipientName() {
		return RecipientName;
	}
	public void setRecipientName(String recipientName) {
		RecipientName = recipientName;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
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
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
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
	public String getRecipientUserId() {
		return RecipientUserId;
	}
	public void setRecipientUserId(String recipientUserId) {
		RecipientUserId = recipientUserId;
	}
	public String getRecipientPassword() {
		return RecipientPassword;
	}
	public void seRecipientPassword(String recipientPassword) {
		RecipientPassword = recipientPassword;
	}
	
	
	public Recipient() {
    	
    }
	
	
    public Recipient(String RecipientName, String Age, String Gender,String Address,String MobileNumber,String Bloodgroup,String Email,String RecipientUserId, String RecipientPassword) {
    	this.RecipientName=RecipientName;
    	this.Age=Age;
    	this.Gender=Gender;
    	this.Address=Address;
    	this.MobileNumber=MobileNumber;
    	this.Bloodgroup=Bloodgroup;
    	this.Email=Email;
    	this.RecipientUserId=RecipientUserId;
    	this.RecipientPassword=RecipientPassword;
    	
    	
    	
    }


}
