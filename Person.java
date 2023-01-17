//This is for Programming Challenge 7 in chapter 10 
//Demostrates inheritance
//Rachael Blank

import java.util.*;

class Person {
	private String name;
	private String address;
	private String phoneNumber;

	public Person() {
	}

	public Person(String xName, String xAddress, String xTelephone) {
		name = xName;
		address = xAddress;
		phoneNumber = xTelephone;
	}


   //mutators and accessors
	public String getName() {
		return name;
	}

	public void setName(String xName) {
		name =xaName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String xAddress) {
		address = xAddress;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String xTelephone) {
		telephone = xTelephone;
	}

	@Override
	public String toString() {
		return "name : " + name + ", address : " + address + ", telephone : " + telephone;
	}

}