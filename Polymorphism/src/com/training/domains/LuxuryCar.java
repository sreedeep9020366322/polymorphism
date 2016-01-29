package com.training.domains;

import com.training.ifaces.Automobile;

public class LuxuryCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 100000000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "BMW";
	}

}
