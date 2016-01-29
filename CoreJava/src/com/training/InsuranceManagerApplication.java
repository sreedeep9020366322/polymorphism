package com.training;

public class InsuranceManagerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LifeInsurance ins1 = new LifeInsurance(101,"Rajesh","qtr",456);
		LifeInsurance ins2 = new LifeInsurance(102,"suresh","qtr",789);
		LifeInsurance ins3 = new LifeInsurance(103,"vignesh","qtr",123);
		LifeInsurance ins4 = new LifeInsurance(104,"Ramesh","qtr",741);
		
		LifeInsurance[] policies = new LifeInsurance[4];
		policies[0] = ins1;
		policies[1] = ins2;
		policies[2] = ins3;
		policies[3] = ins4;
		
		InsuranceManager insmgr= new InsuranceManager();
		insmgr.printPremiums(policies);
		//for static method
		//InsuranceManager.printPremiums(list);
	}

}
