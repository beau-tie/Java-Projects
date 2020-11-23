package project;

public class InvApp { 
	public static void main(String[] args) {
		Inventory test1 = new Inventory();
		
		Inventory test2 = new Inventory("AB1010", "Wooden Claw-hammer", 53);
		test2.showPart();
		
		test1.setPartNumber("CD2020");
		test1.setDescription("Phillips Screwdriver");
		test1.setQuantity(17);
		test1.showPart();
	}
}