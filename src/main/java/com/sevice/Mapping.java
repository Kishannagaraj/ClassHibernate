package com.sevice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.entity.User;


public class Mapping {

	public void oneToOne()
	{

		
		SessionFactory factory = DatabaseService.getInstance().getFactory();
		Session session = factory.openSession();
		
		try {
				
		User user = session.get(User.class, 2);

		System.out.println(" ");
		System.out.println("<-------OneToOne-------> ");
		System.out.println(" ");
		
		System.out.println( "result  :::"+ user);
		
		}catch(Exception e ) {
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}	
	}
	
	public void oneToMany()
	{
		SessionFactory factory = DatabaseService.getInstance().getFactory();
		Session session = factory.openSession();
		try {
			User user = session.get(User.class, 5);
	
			System.out.println(" ");
			System.out.println("<-------OneToMany-------> ");
			System.out.println(" ");
			
			System.out.println( "result  :::"+ user.getBank());
		}catch(Exception e ) {
			e.printStackTrace();
		}finally {
		
			session.close();
			factory.close();
		}
	}
	
	public void ManyToMany()
	{
//		Configuration confg = new Configuration();
//		confg.configure("com/config/hibernate.cfg.xml");
//		
//		SessionFactory factory = confg.buildSessionFactory() ;
//		Session session = factory.openSession();
		
		
		SessionFactory factory = DatabaseService.getInstance().getFactory();
		Session session = factory.openSession();
		try {
			User user = session.get(User.class, 5);
	
			System.out.println(" ");
			System.out.println("<-------ManyToMany-------> ");
			System.out.println(" ");
			
			System.out.println( "result  :::"+ user.getBank());
			System.out.println( "result  :::"+ user.getCourse());
		}catch(Exception e ) {
			e.printStackTrace();
		}finally {
		
			session.close();
			factory.close();
		}
	}
}
