package com.examples.HibernateExp;

import org.hibernate.Session;

import com.examples.HibernateExp.model.xml.Employee;



/**
 * Hello world!
 * 
 *
 */
public class App 
{
	 public static void main( String[] args )
	    {
	        System.out.println("Maven + Hibernate + MySQL");
	        Session session = HibernateUtil.getSessionFactory().openSession();

	        session.beginTransaction();
	        /*Stock stock = new Stock();

	        stock.setStockCode("4716");
	        stock.setStockName("GETS");

	        session.save(stock);*/
	        if("xml".equals(args[0])){
	        	 Employee emp = new Employee("firstName", "lastName", 1000);
	 	        emp.setId(0);
	 	        session.save(emp);
	 	        session.getTransaction().commit();
	 	        System.out.println("Done");
	        }else{
	        	
	        	
	        	
		        	 com.examples.HibernateExp.model.annotations.Employee emp = new  com.examples.HibernateExp.model.annotations.Employee ("firstName", "lastName", 1000);
		 	        emp.setId(0);
		 	        session.save(emp);
		 	        session.getTransaction().commit();
		 	        System.out.println("Done");
		        
	        }
	        
	       
	    }
}
