package project2;

import java.util.Scanner;

	public class InventoryApp2 {
		static Scanner in = new Scanner(System.in);
		public static void main(String args[]) {
			Inventory2 test1 = new Inventory2();
			test1.showPart();
			System.out.println();
			
			Inventory2 test2 = new Inventory2("AB1010", "Wooden claw-hammer", 53, 10.99, 15);
			test2.showPart();
			System.out.println();
			
			test1.setPartNumber("CD2020");
			test1.setDescription("Philips Screwdriver");
			test1.setQuantity(17);
			test1.setUnitPrice(10.99);
			test1.setReorderPoint(5);
			test1.showPart();
			
			Inventory2 inv[] = new Inventory2[2];
			int i;
			for (i=0;i<inv.length;i++) {inv[i] = new Inventory2();}
			for (i=0;i<inv.length;i++) {getData(inv[i]);}
			for (i=0;i<inv.length;i++) {inv[i].showPart();}
		}
		
		public static void getData(Inventory2 e)
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
		
		}
