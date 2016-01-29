package com.training;

public class LifeInsurance {

	private long policyNumber;
	private String policyHolderName;
	private String paymentMode;
	private double policyAmount;
	
	static{
		System.out.println("Static block called.");
	}
	
	{
		System.out.println("Initialization block called.");
	}
	
	public LifeInsurance() {
		super();
		System.out.println("Default Constructor called.");
		// TODO Auto-generated constructor stub
	}

	
	public LifeInsurance(long policyNumber, String policyHolderName, String paymentMode, double policyAmount) {
		super();
		System.out.println("Paramaterized constructor is called.");
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.paymentMode = paymentMode;
		this.policyAmount = policyAmount;
	}


	public long getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public double getPolicyAmount() {
		return policyAmount;
	}

	
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	
	//Proper overloading- change in the arguments.
	
	public double calculate(){
		//System.out.println("in 1st method");
		return 0;
		//return this.policyAmount * .10;
	}
	
	public double calculate(double policyAmt){
		double amount = policyAmt * .10;
		double discount = amount * .05;
		double netAmount = amount - discount;
		return netAmount;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.policyNumber + ": " + this.policyHolderName + ": " + this.paymentMode + ": " + this.policyAmount;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		long code = this.policyNumber + 7 * policyNumber;
		return (int)code;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		//checking for Identity
		if(this == obj)
			return true;
		
		//cautious
		if(obj == null)
			return false;
		
		//Checking the type of objects
		if(this.getClass() != obj.getClass())
			return false;
		
		//Casting
		LifeInsurance ins= (LifeInsurance) obj;
		
		//Checking the Condition
		return policyNumber == ins.policyNumber && policyHolderName == ins.policyHolderName;
	}
	
}
