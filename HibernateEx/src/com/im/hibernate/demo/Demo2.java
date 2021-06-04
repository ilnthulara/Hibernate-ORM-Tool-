package com.im.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.im.hibernate.model.User;

public class Demo2 {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		SessionFactory sf = config.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		//Get single data from the database
		User user = (User) session.get(User.class,1);
		session.getTransaction().commit();
		System.out.println(user.getName());
		System.out.println(user.getAddress());
		

		//Get list of data from the database
		List<User> list = session.createCriteria(User.class).list(); 
		
		for(User u :list){ 
			System.out.println(u.getName()); 
		}
	}
}
