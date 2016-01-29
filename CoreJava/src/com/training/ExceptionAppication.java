package com.training;

import com.training.myexceptions.RangeCheckException;

public class ExceptionAppication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Customer cust = new Customer(101,"Ramesh","ram@abc.com",2);
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
			
			//throw new Exception();
		}
		finally{
			System.out.println("inside finally...");
		}
		
		System.out.println("outside finally block..");
	}

}
