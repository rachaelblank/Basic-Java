//This is for Programming Challenge 4 in chapter 5
//Demostrates methods
//Rachael Blank

import java.util.Scanner;

public class PaintJobEstimator {

	public static void main(String [] args) {
   
		Scanner myScanner = new Scanner(System.in);
		int numRooms; //number of rooms
		double paintPrice; // price of paint per gallon
		double roomWallSpace; // wall space for one room
		System.out.print("How many rooms are you painting? ");
		numRooms = myScanner.nextInt();
		myScanner.nextLine();
		
				
		System.out.print("How much is the paint per gallon? ");
		paintPrice = myScanner.nextDouble();
		myScanner.nextLine();
		
				
		double totalWallSpace = 0; // total amount of wall space for entire job
		for (int count = 1; count <= numRooms; count ++) {
			System.out.print("How many square feet of wall space do you need in room " + count + "? ");
			roomWallSpace = myScanner.nextDouble();
			myScanner.nextLine();
			totalWallSpace += roomWallSpace; // add the amount of wall space per room to the grand total wall space
		}
		
      // declare variables for entire job and how to get totals
		double paintGallons; // total number of paint gallons needed for entire job
		paintGallons = getGallons(totalWallSpace);
      
		double totalHours; // total number of hours the entire job will take to complete
		totalHours = getHours(totalWallSpace);
      
		double totalPaintCost; // total cost of paint needed to complete the job
		totalPaintCost = getPaintCost(paintPrice, paintGallons);
      
		double totalLaborCost; // total cost of labor to complete the job
		totalLaborCost = getLaborCosts(totalHours);
      
		double totalCost; // total cost of the job is labor costs plus paint costs
		totalCost = getTotalCost(totalPaintCost, totalLaborCost);
		
		
		System.out.println("Paint:$" + totalPaintCost);
		System.out.println("Labor: $"+ totalLaborCost);
		System.out.println("Total cost: $" + totalCost);
		
	}
		
		//methods of calculation
      
		public static double getGallons(double wallFeet) {
			double gallons;
			gallons = wallFeet / 115;
			return gallons;
		}
		
		public static double getHours(double wallFeet) {
			double hours; //hours of labor required
			hours = wallFeet / 115;
			hours *= 8;
			return hours;
		}
		
		public static double getPaintCost(double costOfPaint, double totalGallons) {
			double totalPaintCost;
			totalPaintCost = costOfPaint * totalGallons;
			return totalPaintCost;
		}
		
		public static double getLaborCosts(double hours) {
			final double HOURLY_RATE = 18; //Cost for one hour of labor
			double hourPay; //Total cost of labor to complete the job
			hourPay = hours * 18;
			return hourPay;
		}
		
		public static double getTotalCost(double costOfPaint, double costOfLabor) {
			double grandTotal; //Total cost of job
			grandTotal = costOfPaint + costOfLabor;
			return grandTotal;
		}
}