package com.training.domains;

import com.training.ifaces.Automobile;

public class PassengerCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 250000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "i10";
	}

}
