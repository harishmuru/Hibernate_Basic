package com.Project.Hibernate_DasSir;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Project.Hibernate_DasSir.entity.Employee;
import com.Project.Hibernate_DasSir.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Kashi Sir","Trainer",67000);
		Employee e2 = new Employee("Sriram Reddy","Manager",50000);
		
		Transaction tr = null;
		try(Session session = HibernateUtil.getsesf().openSession())
		{
			tr= session.beginTransaction();
			session.persist(e1);
			session.persist(e2);
			tr.commit();
		}
		catch(Exception e)
		{
			if(tr!=null)
			{
				tr.rollback();
				e.printStackTrace();
			}
		}
	}
}
