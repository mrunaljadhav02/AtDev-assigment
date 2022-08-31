package com.mrunal.ATDev_Assignment;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentsDao {

	@Autowired
	SessionFactory sessionFactory;

	public Session getSession() {
		Session session = sessionFactory.openSession();
		return session;
	}
	
	ArrayList<Students> getEntity(){
		Session session = getSession();
		Criteria criteria = session.createCriteria(Students.class);
		ArrayList<Students> slist = (ArrayList<Students>) criteria.list();
		return slist;
		
	}
}
