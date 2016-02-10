package com.training;

/**
 * 
 * @author sperin
 *
 */

public class InsuranceCustomer {

  private String customerName;
  private double customerSalary;
  private double loanAmnt;
  private double gram;

  
  public InsuranceCustomer() {
	super();
}

public double getGram() {
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
  
  public double getCustomerSalary() {
    return customerSalary;
  }
  
  public void setCustomerSalary(long customerSalary) {
    this.customerSalary = customerSalary;
  }
  
  public double calcPersonalInterest(){
	  PersonalLoan pl = new PersonalLoan();
	  return pl.interestCalculate(customerSalary);
	  
  }
  
  public double calcJewelInterest(){
	  JewelLoan pl = new JewelLoan();
	  return pl.interestCalculate(gram);
	  
  }
  
  /*public long calculate(long salary) {
	  loanAmnt = 12 * salary;
	  if(loanAmnt < 5000)
		  return 14;
	  else
		  return 13;
      
  }
  */
}
