package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.DonorDAO;
import com.model.Donor;
@Service
public class DonorServiceImpl implements DonorService {
 @Autowired
 private DonorDAO donorDao;
 @Override
 @Transactional
 public void registerDonor(Donor donor) {
  // TODO Auto-generated method stub
	 donorDao.registerDonor(donor);
 }
 @Override
 public Donor loginDonor1(Donor donor) {        
  // TODO Auto-generated method stub
  return donorDao.loginDonor(donor);
 }
@Override
public Donor loginDonor(Donor donor) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Donor loginStudent(Donor donor) {
	// TODO Auto-generated method stub
	return null;
}

}