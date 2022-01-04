package com.dao;
import java.util.List;
import javax.persistence.NoResultException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.model.Donor;
@Repository
@Transactional
public class DonorDAOImpl implements DonorDAO{
 @Autowired
 private SessionFactory factory;
 @Override
 public void registerDonor(Donor donor) {
  // TODO Auto-generated method stub
  Session session = factory.getCurrentSession();
  session.save(donor);
 }
 @Override
 public Donor loginDonor(Donor donor) {
  // TODO Login
  Session session = factory.getCurrentSession();
  try {
  Query<Donor> query = session.createQuery("from Student where userName =:userName and password =:password",Donor.class);
  query.setParameter("userName", donor.getDonorName());
  query.setParameter("password", donor.getDonorPassword());
  donor = query.getSingleResult();
  return donor;
  }catch (NoResultException e) {
   // TODO: handle exception
   return null;
  }
 }
}