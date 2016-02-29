package com.training;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class CustomerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log = Logger.getLogger("MyFirstLog");
		BasicConfigurator.configure();
		
		Customer cust1 = new Customer();
	
		log.info("In main method");
		cust1.setCustomerId(101);
		cust1.setCustomerName("Sreedeep");
		cust1.setEmailId("sreedeepkarun@gmail.com");
		cust1.setHandPhone(808402113);
		
		//Customer cust2 = new Customer(102,"Shayma","shaymakhan@gmail.com",787654321);
		System.out.println(cust1.showCustomer());
		
		log.info("main method over");
		
		//System.out.println(cust2.showCustomer());
	
		
	}
}
