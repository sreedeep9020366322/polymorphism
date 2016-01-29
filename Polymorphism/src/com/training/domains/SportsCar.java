package com.training.domains;

import com.training.ifaces.Automobile;

public class SportsCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 20000000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Ferrari";
	}

}
