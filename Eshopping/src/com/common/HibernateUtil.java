package com.common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static SessionFactory sessionFactory;

	static
	{
		
		try {
			
			sessionFactory =new Configuration().configure().buildSessionFactory();
			
		} 
		catch (Exception e) {
			System.out.println(e);
			
		}
		
		
	}
	
}
