package com.training;

public class Over_Riding_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LifeInsurance ins1 = new LifeInsurance(101,"suresh" ,"qtr",1500);
		System.out.println(ins1);
		
		LifeInsurance ins2 = new LifeInsurance(101,"suresh" ,"qtr",1500);
		System.out.println(" Exact Value : "+ins1.equals(ins2));
	
		String str1= null;
		System.out.println(" Cautious : "+ins1.equals(str1));

		String str2= "Random String";
		System.out.println(" Different type : "+ins1.equals(str2));
		
		LifeInsurance ins3 = ins1;
		System.out.println(" Identity Check : "+ins1.equals(ins3));

		
	}

}
