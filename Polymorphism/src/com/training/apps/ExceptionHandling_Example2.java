package com.training.apps;

public class ExceptionHandling_Example2 {

	public static void main(String[] args){
		
		try{
			String age = "40";
			//String age = "Fourty";
			//String age = null;
			int age2 = Integer.parseInt(age);
			System.out.println(++age2);
		}
		catch(NumberFormatException | NullPointerException e){
			
			if(e instanceof NumberFormatException)
			{
				System.out.println(e.getMessage()+ " :age not valid. ");
			}
			else
				System.out.println(e.getMessage());
		}
	}
}
