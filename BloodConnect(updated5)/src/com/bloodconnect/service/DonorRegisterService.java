package com.bloodconnect.service;
import org.hibernate.Query;

import java.util.ArrayList;
import java.util.List;

import com.bloodconnect.Hibernate.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bloodconnect.model.Donor;

public class DonorRegisterService {

	public boolean register(Donor donor) {
		Session session = HibernateUtil.openSession();
		if (isUserExists(donor))
			return false;

		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.saveOrUpdate(donor);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return true;
	}

	public boolean isUserExists(Donor donor) {
		Session session = HibernateUtil.openSession();
		boolean result = false;
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from Donor where DonorUserId='" + donor.getDonorUserId() + "'");
			Donor d = (Donor) query.uniqueResult();

			tx.commit();
			if (d!= null)
				result = true;
		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return result;
	}
}