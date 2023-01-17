//This is for Programming Challenge 3 in chapter 7
//Demostrates arrays
//Rachael Blank

//**if in the same folder, should work.. hopefully

import javax.swing.JOptionPane;

public class TestChargeAccount {
   public static void main(String[] args) {
      ChargeAccount numberSet = new ChargeAccount();
         
      //ask the user to enter account number and store as a string. then assign as string
      String userInput;
      int userNumber;
   
      userInput = JOptionPane.showInputDialog("Enter your account number: ");
      
      //convert string (userInput) to number (userNumber)
      userNumber = Integer.parseInt(userInput);
      
      if (numberSet.accountValid(userNumber)) {
         JOptionPane.showMessageDialog(null, "The account number " + userNumber + " is valid");
         }
         else {
         JOptionPane.showMessageDialog(null, "The account number " + userNumber + " is NOT valid");
         }
      System.exit(0);
      }
   }
