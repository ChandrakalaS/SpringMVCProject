package com.xworks.hibernatedemo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SportsDAO 
{

	public SportsDAO() 
	{
		System.out.println("Created   \t"+this.getClass().getSimpleName());
	}
	
	public void save(SportsDTO dto)
	{
			
		Configuration cfg=new Configuration();
			cfg.configure();
			SessionFactory  factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(dto);
			tx.commit();
			session.close();
		
	}
}