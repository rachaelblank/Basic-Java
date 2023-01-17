//This is for Programming Challenge 3 in chapter 8
//Demostrates classes/objects
//Rachael Blank

public class RoomDimension { 

   double length;
   double width;
   
   public RoomDimension(double len, double w) { //UML diagram uses len and w
   length = len;
   width = w;
   }
   
   public double getLength() {
   return length;
   }
   public double getWidth() {
   return width;
   }
   public double getArea() {
   return length*width;
   }
   public String toString() {
   String output;
   // \n is new line and needs to be in parathesis
   output = "Room dimensions: \n Length: " + length + "\n Width: " + width + "\n Area: " + getArea();
   return output;
   }
}