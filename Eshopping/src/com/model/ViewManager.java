package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.common.HibernateUtil;
import com.pojo.Admin;
import com.pojo.Order;
import com.pojo.Product;
import com.pojo.Register;

public class ViewManager {

	public static SessionFactory s=HibernateUtil.sessionFactory;

	public void SaveUserData(Register r) {
		Session s1=s.openSession();
		Transaction t=s1.beginTransaction();
		s1.save(r);
		t.commit();
		s1.close();
		
	}

	public Register SearchData(String e, String p) {
		
		Session s1=s.openSession();
		Criteria criteria=s1.createCriteria(Register.class);
		criteria.add(Restrictions.eq("email", e));
		criteria.add(Restrictions.eq("password", p));
		Register r=(Register)criteria.uniqueResult();
		return r;
		
	}

	public Admin SearchAdminData(String us, String p) {
		Session s1=s.openSession();
		Criteria criteria=s1.createCriteria(Admin.class);
		criteria.add(Restrictions.eq("username", us));
		criteria.add(Restrictions.eq("password", p));
		Admin a=(Admin)criteria.uniqueResult();
		return a;
	}

	public void AddProduct(Product pro) {
		
		Session s1=s.openSession();
		Transaction t=s1.beginTransaction();
		s1.save(pro);
		t.commit();
		s1.close();
		
	}
		
	public List<Product> ShowProductDetails()
	{
		
	Session s1=s.openSession();
	Criteria criteria=s1.createCriteria(Product.class);
	List<Product> plist=criteria.list();
	return plist;
		
	}
	
	public Product showSignleProduct(int pid) {
		
		Session s1=s.openSession();
		Criteria criteria=s1.createCriteria(Product.class);
		criteria.add(Restrictions.eq("pid", pid));
		Product pro=(Product)criteria.uniqueResult();
		return pro;
			
	}

	public void SaveOrder(Order or) {
		// TODO Auto-generated method stub
		Session s1=s.openSession();
		Transaction t=s1.beginTransaction();
		s1.save(or);
		t.commit();
		s.close();
		
		
	}

	
	
	
}
