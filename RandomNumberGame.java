//This is for Programming Challenge #17 in chapter 4
//Rachael Blank

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame
{
   public static void main(String[] args)
   {
   Random rand = new Random();
   Scanner scanner = new Scanner(System.in);
   
   int randomNumber = rand.nextInt(10) + 1;
   //test to make sure the program is working
   //System.out.println("Random number:" + randomNumber);
   
   //start while loop after declaring random number or else it will change every guess
   while(true) {
   System.out.println("What is your guess (1-10):");
   
   int userGuess = scanner.nextInt();
   
   if (userGuess == randomNumber){
   System.out.println("You guessed the right number!");
   break;
   }
   else if(randomNumber > userGuess) {
   System.out.println("You guessed too low, please try again.");
   }
   else { //don't need to add statement because they are no other alternatives left
   System.out.println("You guessed too high, please try again.");
   }
}
} 
}  