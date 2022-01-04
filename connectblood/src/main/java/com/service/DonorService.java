package com.service;
import com.model.Donor;

public interface DonorService {
	
	 public void registerDonor(Donor donor);
	 
	 public Donor loginStudent(Donor donor);

	Donor loginDonor(Donor donor);

	Donor loginDonor1(Donor donor);

}
