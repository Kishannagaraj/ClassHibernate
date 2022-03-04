package com.sevice;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseService {
	
	private static DatabaseService instance;
	
	private Configuration confg;
	
	public static DatabaseService getInstance() {
		
		if(instance == null) {
			
			synchronized (DatabaseService.class){
				
				if(instance == null)
				{
					instance = new DatabaseService();
					
					return instance;
				}
				
			}
			
		}
		
		return instance;
		
	}
	
	private DatabaseService() {
		confg = new Configuration();
		confg.configure("com/config/hibernate.cfg.xml");
	}
	
	public SessionFactory getFactory() {
		
		return confg.buildSessionFactory() ;
	}

}
