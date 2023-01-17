//This is for Programming Challenge #13 in chapter 3
//Rachael Blank

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MobileServiceProvider
{
   public static void main(String[] args)
   {
   //activate the scanner
   Scanner myScanner = new Scanner(System.in);
   
    // Get the user's package.
      System.out.println("Using A,B, or C, what package do you have?");
      String subscription = myScanner.nextLine();
      
      double packageA = 39.99;
      double packageB = 59.99;
      double packageC = 69.99;
      
      String input;
      
// Get the user's minutes
      System.out.println("How many minutes did you use?");
      int mins = myScanner.nextInt();
      
      double totalForA = (mins-450)*0.45; 
      double totalForB = (mins-900)*0.40; 
 
 // Package C will always be the same, if B or A, need to consider mins
   if(subscription == "A") {
      System.out.printf("Your bill is: $" + 39.99 + totalForA);
      
   } 
   if (subscription == "B"){
      System.out.printf("Your bill is: $" + totalForB);
     
   }
   else {
      System.out.printf("Your bill is: $69.99"); 
   }
  }
 }   
