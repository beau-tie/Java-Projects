package Inventory;

import java.io.*;
import java.util.Scanner;

public class Inventory {
	public static void main (String[] args) {
		
		int i;
		
		for (i=0;i<5;i++) {
			// Scanner for name of item
			Scanner name = new Scanner(System.in);
			System.out.println("Enter Item Name:");
			String item = name.nextLine();
		
			// Scanner for quantity of items
			Scanner number = new Scanner(System.in);
			System.out.println("Enter Item Quantity:");
			var quantity = number.nextInt();
		
			// Scanner for price of items
			Scanner price = new Scanner(System.in);
			System.out.println("Enter Item Price:");
			double Price = price.nextDouble();
			
			double value = (Price * quantity); 
			double total; //*all values of items added together*
			// *add some way to store unique values for the table here*
		}
		
		System.out.println("Item Name	   QTY  	  Price    Value");
		System.out.printf(" %d				%d			%d		%d", item, quantity, price, value);
		System.out.printf(" %d				%d			%d		%d", item, quantity, price, value);
		System.out.printf(" %d				%d			%d		%d", item, quantity, price, value);
		System.out.printf(" %d				%d			%d		%d", item, quantity, price, value);
		System.out.println("========================================");
		System.out.printf("Total===============================%d", total);
		// I understand this is not the way to achieve the wanted result, but I understand
		// the concept of creating a table like this. I apologize for the incompleteness, but
		// I got stuck for several hours and tried to reach outfor help but to no avail.
	}
}