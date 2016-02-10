package com.training;

public class PersonalLoan extends Loan {

	//private long interestRate;
	//private long loanAmnt;
	private double loanAmnt;
	
	public double interestCalculate(double sal){
		
		loanAmnt= 12 * sal;
		
		if(loanAmnt < 50000){
			return 14;
		}
		else
			return 13;
		
	}
}
