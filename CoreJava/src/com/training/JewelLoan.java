package com.training;

public class JewelLoan extends Loan {

	//private long gram;
	
	public double interestCalculate(double gram){
		
		if(gram < 100){
			return  10;
		}
		else
			return 11;
	}
	
}
