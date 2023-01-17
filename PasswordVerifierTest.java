//This is for Programming Challenge 5  in chapter 9
//Demostrates text processing and wrapper classes
//Rachael Blank

import java.util.Scanner;

public class PasswordVerifierTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//taking user input
		System.out.print("Enter the password: ");
		String password = scanner.nextLine();
		//testing the method
		if (PasswordVerifier.isValid(password))
			System.out.println("Your password is valid");
		else
			System.out.println("Your password is invalid");
		scanner.close();
	}
}