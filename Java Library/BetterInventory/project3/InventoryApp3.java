package project3;

import java.util.*;
import java.io.*;

public class InventoryApp3 {
		
		static Scanner in = new Scanner(System.in);
		public static void main(String args[]) throws Exception {
			int i;
			int recCount;
			int userChoice = 0;
			String dataIn;
			
			Inventory3 inv[] = new Inventory3[50];
			for (i=0;i<50;i++) {inv [i] = new Inventory3();}
			recCount = readData(inv);
			
			System.out.printf("\tInventory Management Program\n");
			System.out.printf("\t\t     Main Menu\n");
			
			do {
				System.out.println("");
				System.out.println("\t1) Display Inventory Records");
				System.out.println("\t2) Add Item to Inventory");
				System.out.println("\t3) Find Item Record in Invnetory (by Part Number)");
				System.out.println("\t4) Close Program\n");
				
				do {
					System.out.print("Enter User Choice (1,2,3,4): ");
					dataIn = in.nextLine();
					userChoice = Integer.parseInt(dataIn);
				} while (!((userChoice >= 1) && (userChoice <=4)));
				if (userChoice == 1) {
					listInv(recCount, inv);
				} if (userChoice == 2 ) {getData(inv[recCount]); recCount++;}
				if (userChoice == 3) {findInventory(recCount, inv);}
				
			} while (userChoice != 4);
			savaData(recCount, inv);	
		}
		public static int readData(Inventory3 e[])throws Exception{
			File infile = new File("Inventory3.txt");
			Scanner input = new Scanner (infile);
			String dataIn = "";
			int qty;
			double unitPrice;
			int reorder;
			int count = 0;
			
			while(input.hasNext()) {
				dataIn=input.nextLine();
				e[count].setPartNumber(dataIn);
				dataIn=input.nextLine();
				e[count].setDescription(dataIn);
				dataIn=input.nextLine();
				unitPrice=Double.parseDouble(dataIn);
				e[count].setUnitPrice(unitPrice);
				dataIn=input.nextLine();
				qty = Integer.parseInt(dataIn);
				e[count].setQuantity(qty);
				dataIn=input.nextLine();
				reorder = Integer.parseInt(dataIn);
				e[count].setReorderPoint(reorder);
				count++;
			}
			
			input.close();
			return count;
		}
		public static void listInv(int count, Inventory3 e[]) {
			int i;
			for (i=0;i<count;i++) {e[i].showPart();} }
		
		public static void findInventory(int count, Inventory3 e[]) {
			String searchPartNum = "";
			String partNum = "";
			int i = 0;
			int index = 0;
			boolean found = false;
			
			System.out.print("Search the part number: ");
			searchPartNum=in.nextLine();
			
			while (!found && i<count) {
				partNum = e[i].getPartNumber();
				if (partNum.equalsIgnoreCase(searchPartNum)) {found = true; index = i;} i++;
			} if (found) {e[index].showPart(); System.out.print("\nPress Enter to Continue"); String dummy = in.nextLine();}
			else {System.out.println("Part Number" + searchPartNum + " not found");}
		}
		
		public static void getData(Inventory3 e)
		{
			String dataIn = "";
			String description = "";
			int quantity = 0;
			double unitPrice = 0;
			int reorderPoint = 0;
			String partNum = "";
			
			do
			{
				System.out.print("Please enter the part number: ");
				dataIn = in.nextLine();
				partNum = dataIn;
			} while (!e.checkPartNum(partNum));
			e.setPartNumber(partNum);
			
			do
			{
				System.out.print("Please enter the description: ");
				dataIn = in.nextLine();
				description = dataIn;
			} while (!e.checkDescrip(description));
			e.setDescription(description);
			
			do
			{
				System.out.print("Please enter the quantity: ");
				dataIn = in.nextLine();
				quantity = Integer.parseInt(dataIn);
			} while (!e.checkQty(quantity));
			e.setQuantity(quantity);
			
			do
			{
				System.out.print("Please enter the price: ");
				dataIn = in.nextLine();
				unitPrice = Double.parseDouble(dataIn);
			} while (!e.checkPrice(unitPrice));
			e.setUnitPrice(unitPrice);
			
			do
			{
				System.out.print("Please enter the reorder point: ");
				dataIn = in.nextLine();
				reorderPoint = Integer.parseInt(dataIn);
			} while (!e.checkReorder(reorderPoint));
			e.setReorderPoint(reorderPoint);
		}

			public static void savaData(int count, Inventory3 e[]) throws Exception {
				File outfile = new File("inventory3.txt");
				PrintWriter output = new PrintWriter(outfile);
		
				int i;
		
				for (i=0; i<count; i++) {
					output.println(e[i].getPartNumber());
					output.println(e[i].getDescription());
					output.println(e[i].getUnitPrice());
					output.println(e[i].getQuantity());
					output.println(e[i].getReorderPoint());
					output.close();
				}
			}
}