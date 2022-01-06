package com.bloodconnect.service;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bloodconnect.Hibernate.util.HibernateUtil;
import com.bloodconnect.model.Recipient;




public class RecipientLoginService {

    public boolean authenticateUser(String RecipientUserId, String RecipientPassword) {
        Recipient recipient = getUserByUserId(RecipientUserId);        
        if(recipient!=null && recipient.getRecipientUserId().equals(RecipientUserId) && recipient.getRecipientPassword().equals(RecipientPassword)){
            return true;
        }else{ 
            return false;
        }
    }

    public Recipient getUserByUserId(String RecipientUserId) {
        Session session = HibernateUtil.openSession();
        Transaction tx = null;
        Recipient user = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Recipient where RecipientUserId='"+RecipientUserId+"'");
            user = (Recipient)query.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return user;
    }
    
    public List<Recipient> getListOfUsers(){
        List<Recipient> list = new ArrayList<Recipient>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;        
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Recipient").list();                        
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
