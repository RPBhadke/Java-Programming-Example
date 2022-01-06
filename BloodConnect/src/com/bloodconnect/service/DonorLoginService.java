package com.bloodconnect.service;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bloodconnect.Hibernate.util.HibernateUtil;


import com.bloodconnect.model.Donor;

public class DonorLoginService {

    public boolean authenticateUser(String DonorUserId, String DonorPassword) {
        Donor donor = getUserByUserId(DonorUserId);        
        if(donor!=null && donor.getDonorUserId().equals(DonorUserId) && donor.getDonorPassword().equals(DonorPassword)){
            return true;
        }else{ 
            return false;
        }
    }

    public Donor getUserByUserId(String DonorUserId) {
        Session session = HibernateUtil.openSession();
        Transaction tx = null;
        Donor donor = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Donor where DonorUserId='"+DonorUserId+"'");
            donor = (Donor)query.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return donor;
    }
    
    public List<Donor> getListOfUsers(){
        List<Donor> list = new ArrayList<Donor>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;        
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Donor").list();                        
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }
}
