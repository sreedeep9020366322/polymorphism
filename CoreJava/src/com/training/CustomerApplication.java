package com.training;

public class CustomerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1 = new Customer();
	
		cust1.setCustomerId(101);
		cust1.setCustomerName("Shariq");
		cust1.setEmailId("shariqparwez@outlook.com");
		cust1.setHandPhone(808402113);
		
		//Customer cust2 = new Customer(102,"Shayma","shaymakhan@gmail.com",787654321);
		System.out.println(cust1.showCustomer());
		
		//System.out.println(cust2.showCustomer());
	
		
	}
}
