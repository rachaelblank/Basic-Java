//This is for Programming Challenge 3 in chapter 7
//Demostrates arrays
//Rachael Blank

public class ChargeAccount {
   //18 numbers in the array
   private int [] chargeAccountNumbers = { 5658845, 8080152, 1005231, 4520125, 4562555, 6545231,
      7895122, 5552012, 3852085, 8777541, 5050552, 7576651, 8451277, 7825877, 7881200, 1302850, 
      1250255, 4851002 };

   //determine if the account is valid (or matches a number in the array)
   public boolean accountValid (int numberGiven) {
      for (int  index = 0; index < chargeAccountNumbers.length; index++) {
         if (numberGiven == chargeAccountNumbers[index]) { 
         return true; //exits out of loop if true
         }
      }
      return false;
   }
   //constructor - same name as above
   public ChargeAccount () {
   
   }
}