package com.training;

public class InsuranceCustomer {

	private String customerName;
	private long customerSalary;
	private long gram;
	
	public long getGram() {
		return gram;
	}
	public void setGram(long gram) {
		this.gram = gram;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerSalary() {
		return customerSalary;
	}
	public void setCustomerSalary(long customerSalary) {
		this.customerSalary = customerSalary;
	}
	
	public long calPersonalInterest(long salary){
		return 0;
	}
	
}
