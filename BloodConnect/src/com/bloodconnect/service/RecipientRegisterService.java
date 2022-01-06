package com.bloodconnect.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bloodconnect.Hibernate.util.HibernateUtil;
import com.bloodconnect.model.Recipient;

public class RecipientRegisterService {

	public boolean register(Recipient recipient) {
		Session session = HibernateUtil.openSession();
		if (isUserExists(recipient))
			return false;

		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.saveOrUpdate(recipient);
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

	public boolean isUserExists(Recipient recipient) {
		Session session = HibernateUtil.openSession();
		boolean result = false;
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session
					.createQuery("from User where RecipientUserId='" + recipient.getRecipientUserId() + "'");
			Recipient r = (Recipient) query.uniqueResult();

			tx.commit();
			if (r != null)
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