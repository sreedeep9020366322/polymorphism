package com.training;

public class JewelLoan extends Loan {

	//private long gram;
	
	public long interestCalculate(long gram){
		
		if(gram < 100){
			return  10;
		}
		else
			return 11;
	}
	
}
