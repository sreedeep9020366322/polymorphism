package com.training;

import java.util.Scanner;

public class InsuranceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LifeInsurance ins1= new LifeInsurance();
		
		
		//Instance Variable has a default value
		System.out.println(ins1.calculate());
		
		//Parameterized constructor
		LifeInsurance ins2= new LifeInsurance(1234,"sreedeep","QTR",4000);
		System.out.println(ins2.calculate());
		
		//using wrapper class
		long policyNumber= Long.parseLong(args[0]);
		double policyAmount= Double.parseDouble(args[3]);
		
		//Command line arguments
		LifeInsurance ins3= new LifeInsurance(policyNumber,args[1],args[2],policyAmount);
		System.out.println(ins3.calculate());
		
		//Using Scanner Class
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter policy number: ");
		long policyNum= sc.nextLong();
		
		System.out.println("Enter Policy holder name: ");
		String policyName2= sc.next();
		
		System.out.println("Enter Payment Mode: ");
		String paymentMode2= sc.next();
		
		System.out.println("Enter Premium amount: ");
		double premiumAmount2= sc.nextDouble();
		
		LifeInsurance ins4= new LifeInsurance(policyNum,policyName2,paymentMode2,premiumAmount2);
		System.out.println(ins4.calculate());
		
		sc.close();
		
		//method overloading
		LifeInsurance ins5= new LifeInsurance(policyNum,policyName2,paymentMode2,premiumAmount2);
		System.out.println(ins5.calculate(100));
		
	}

}
