package com.mrunal.ATDev_Assignment;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsService {

	@Autowired
	StudentsDao studentsDao;

	//Fetch all student info
	public ArrayList<Students> getStudentsInfo() {
		return studentsDao.getEntity();
	}

	// Add new Student in db
	public ArrayList<Students> addNewStudentsInfo(Students st) {
		Session session = studentsDao.getSession();
		Criteria criteria = session.createCriteria(Students.class);
		ArrayList<Students> slist = (ArrayList<Students>) criteria.list();
		Transaction transaction = session.beginTransaction();

		Students students = new Students();
		students.setS_rollno(st.s_rollno);
		students.setS_class(st.s_class);
		students.setS_firstname(st.s_firstname);
		students.setS_lastname(st.s_lastname);
		students.setS_contactno(st.s_contactno);

		session.save(students);
		transaction.commit();

		return studentsDao.getEntity();
	}

	
	//Update student info
	public ArrayList<Students> updateStudentsInfo(Students st) {

		Session session = studentsDao.getSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Students.class);
		ArrayList<Students> slist = (ArrayList<Students>) criteria.list();

		slist.forEach(obj -> {
			if (obj.getS_rollno().equals(st.s_rollno)) {
				obj.setS_class(st.s_class);
				obj.setS_firstname(st.s_firstname);
				obj.setS_lastname(st.s_firstname);
				obj.setS_contactno(st.s_contactno);
			}
		});
		session.getTransaction().commit();
		return studentsDao.getEntity();
	}
	
	
	// Delete student by id
	public ArrayList<Students> deleteStudentsInfo(String id) {
		Session session = studentsDao.getSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Students.class);
		ArrayList<Students> slist = (ArrayList<Students>) criteria.list();
		
		Students ST = session.get(Students.class, id);
		if(ST != null) {
			session.delete(ST);	
		}
		session.getTransaction().commit();
		return studentsDao.getEntity();
	}

}
