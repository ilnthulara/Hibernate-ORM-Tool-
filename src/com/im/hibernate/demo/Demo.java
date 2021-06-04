package com.im.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.im.hibernate.model.User;

public class Demo {
	public static void main(String[] args) {
		User user = new User();
		
		//Set Values
		//user.setId(1);
		user.setName("Nethmi Thulara");
		user.setAddress("Maharagama");
		user.setTelephone("0712721720");
		user.setNIC("9978643782v");
		user.setJoinedDate(new Date());
		user.setBod(new Date());
		
		Configuration config = new Configuration();
		SessionFactory sf = config.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}
}
