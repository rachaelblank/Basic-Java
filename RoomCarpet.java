//This is for Programming Challenge 3 in chapter 8
//Demostrates classes/objects
//Rachael Blank

public class RoomCarpet {

   RoomDimension size;
   double carpetCost; 
   
   //UML uses dim
   public RoomCarpet(RoomDimension dim, double cost) {
   size = new RoomDimension(dim.getLength(), dim.getWidth());
   carpetCost = cost;
   }
   public double getTotalCost() {
   return carpetCost;
   }
   public String toString() {
   String output = size + "\n Carpet cost: $" + carpetCost * size.getArea();
   return output;
   }
}