package com.msrm.springframeworks.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.msrm.springframeworks.dao.EmployeeDAO;
import com.msrm.springframeworks.dos.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Employee e) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(e);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	public List<Employee> list() {
		Session session = this.sessionFactory.openSession();
		List<Employee> EmployeeList = session.createQuery("from Employee").list();
		session.close();
		return EmployeeList;
	}

}
