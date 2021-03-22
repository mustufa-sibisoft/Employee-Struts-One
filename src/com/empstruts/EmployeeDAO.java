package com.empstruts;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class EmployeeDAO {

	// Create of CRUD
	public static void addEmployee(Employee user) {
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trns != null) {
				trns.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	// Read of CRUD
	@SuppressWarnings("unchecked")
	public static List<Employee> getAllEmployees() {
		List<Employee> users = new ArrayList<Employee>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			users = session.createQuery("from Employee").getResultList();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return users;
	}

	// Read of CRUD
	public Employee getEmployeeById(int userid) {
		Employee user = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			
			String hqlQuery = "from Employee where id = :id";
			@SuppressWarnings("rawtypes")
			Query query = session.createQuery(hqlQuery);
			query.setParameter("id", userid);
			user = (Employee) query.getSingleResult();
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return user;
	}

	// Update of CRUD
	public static void updateEmployee(Employee user) {
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			session.update(user);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trns != null) {
				trns.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	// Delete of CRUD
	public static void deleteEmployee(int userid) {
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			Employee user = (Employee) session.load(Employee.class, new Integer(userid));
			session.delete(user);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trns != null) {
				trns.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
