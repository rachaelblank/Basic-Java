//This is for Programming Challenge 7 in chapter 10 
//Demostrates inheritance
//Rachael Blank

import java.util.*;

public class TestPersonAndCustomer {

	public static void main(String[] args) {
   
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = scanner.nextLine();
      
		System.out.println("Enter address: ");
		String address = scanner.nextLine();
      
		System.out.println("Enter telephone number: ");
		String phoneNumber = scanner.nextLine();
      
		System.out.println("Enter customer number: ");
		String customerNumber = scanner.nextLine();
      
		System.out.println("Sign up for the mailing list?");
		boolean s = scanner.nextBoolean();
      
		Customer c = new Customer(name, address, phoneNumber, customerNumber, s);
		System.out.println(c);

	}
}