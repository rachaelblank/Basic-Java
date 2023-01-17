//This is for Programming Challenge 4 in chapter 6
//Demostrates class
//Rachael Blank

import java.util.*;

public class RetailItemData {

public static void main(String[] args) {

        RetailItem r1 = new RetailItem();
        RetailItem r2 = new RetailItem();
        RetailItem r3 = new RetailItem();
        
        //set methods
        r1.setDescription("Jacket");
        r1.setUnits(12);
        r1.setPrice(59.95);
        
        r2.setDescription("Designer Jeans");
        r2.setUnits(40);
        r2.setPrice(34.95);
        
        r3.setDescription("Shirt");
        r3.setUnits(20);
        r3.setPrice(24.95);
       
       
        System.out.println("Item #1: " + r1.getDescription() + " - " + r1.getUnits() + " - $" + r1.getPrice());
        System.out.println("Item #2: " + r2.getDescription() + " - " + r2.getUnits() + " - $" + r2.getPrice());
        System.out.println("Item #3: " + r3.getDescription() + " - " + r3.getUnits() + " - $" + r3.getPrice());
        
        System.exit(0);
	}
} 

