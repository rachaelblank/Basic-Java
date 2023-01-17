//This is for Programming Challenge 4 in chapter 6
//Demostrates class
//Rachael Blank

import java.util.*;

public class RetailItem {
   
   //fields on this class
   private String description;
   private int unitsOnHand;
   private double retailPrice;
   
   // constructor that accepts arguments
   RetailItem (String description, int units, double price) {
      description = description;
      unitsOnHand = units;
      retailPrice = price;
   }
   
   // mutator (setter) methods
   public void setDescription (String description) {
      description = description;
   }
   public void setUnits (int units) {
      unitsOnHand = units;
   }
   public void setPrice (double price) {
      price = retailPrice;
   }
 
   // acessor (getter) methods 
   public String getDescription () {
      return description;
   }
   public int getUnits () {
      return unitsOnHand;
   }
   public double getPrice () {
      return retailPrice;
   }
  
}
