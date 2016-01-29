package com.training;
import java.util.*;

public class LoanApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InsuranceCustomer customer1 = new InsuranceCustomer();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter customer name : ");
		customer1.setCustomerName(sc.next());
		
		System.out.println("Enter customer salary : ");
		customer1.setCustomerSalary(sc.nextLong());
		
		System.out.println("Enter gram salary : ");
		customer1.setGram(sc.nextLong());
		
		customer1.calPersonalInterest(customer1.getCustomerSalary());
	}

}
