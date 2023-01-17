//This is for Programming Challenge 7 in chapter 10 
//Demostrates inheritance
//Rachael Blank

import java.util.*;

class Customer extends Person {
	private String customerNumber;
	private boolean isInMailingList;

	public Customer(String xName, String xAddress, String xTelephone, String xCustomerNumber,boolean xIsInMailingList) {
		
      super(xName, xAddress, xTelephone);
		customerNumber = xCustomerNumber;
		isInMailingList = xIsInMailingList;
	}

   //mutators and accessors
	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String xCustomerNumber) {
		customerNumber = xCustomerNumber;
	}

	public boolean isInMailingList() {
		return isInMailingList;
	}

	public void setInMailingList(boolean xIsInMailingList) {
		isInMailingList = xIsInMailingList;
	}

	@Override
	public String toString() {
		return super.toString() + " CustomerNumber : " + customerNumber + ", customer wishes to be on a mailing list : "
				+ isInMailingList;
	}

}