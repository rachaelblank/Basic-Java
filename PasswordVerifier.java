//This is for Programming Challenge 5  in chapter 9
//Demostrates text processing and wrapper classes
//Rachael Blank

import java.util.*;

public class PasswordVerifier {
	public static boolean isValid(String password) {
   
      //define criteria
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigit = false;
      char ch;

		
		for (int i=0; i < password.length(); i++) {
         ch = password.charAt(i);
         if (Character.isUpperCase(ch)) {
            hasUpper = true;
         }
         else if (Character.isLowerCase(ch)) {
            hasLower = true;
         }
         else if (Character.isDigit(ch)) {
            hasDigit = true;
         }
         if (hasUpper && hasLower && hasDigit) {
            return true;
         }
      }
      return false;
	}
}