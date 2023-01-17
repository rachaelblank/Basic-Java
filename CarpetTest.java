//This is for Programming Challenge 3 in chapter 8
//Demostrates classes/objects
//Rachael Blank

import java.util.Scanner;

public class CarpetTest {

public static void main(String[] args) {

   final double carpetPrice = 8.00;
   double length;
   double width;
   RoomDimension dimensions;
   RoomCarpet room;
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.print("Enter the length of the room: ");
   length = keyboard.nextDouble();
   
   System.out.print("Enter the width of the room: ");
   width = keyboard.nextDouble();

   dimensions = new RoomDimension(length,width);
   room = new RoomCarpet(dimensions, carpetPrice);
   
   System.out.println(room);
}
}