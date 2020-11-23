package project2;

public class Inventory2 {

	int quantity;
	int reorderPoint;
	double unitPrice;
	String partNumber;
	String description;
	
	Inventory2()
	{
		partNumber = "AA0000";
		description = "Test Item";
		quantity = 0;
		unitPrice = 9.99;
		reorderPoint = 10;
	}
	
	Inventory2(String pnum, String desc, int qty, double unitp, int reorder)
	{
		partNumber = pnum;
		description = desc;
		quantity = qty;
		unitPrice = unitp;
		reorderPoint = reorder;
	}
	
	public void setQuantity(int qty) {quantity = qty;}
	public void setReorderPoint(int reorder) {reorderPoint = reorder;}
	public void setUnitPrice(double unitp) {unitPrice = unitp;}
	public void setPartNumber(String pnum) {partNumber = pnum;}
	public void setDescription(String desc) {description = desc;}
	
	public boolean checkQty(int qty) {
		if ((qty >= 0) && (qty < 1000)) {return true;} else {return false;}
	}
	
	public boolean checkReorder(int reorder) {if ((reorder >= 0) && (reorder < 500)) {return true;}
	else {return false;}}
	
	public boolean checkPrice(double unitp) {if (unitp >= 0) {return true;} 
	else {return false;}}
	
	public boolean checkDescrip(String desc) {
		if ((desc.length() >= 5) && (desc.length() <= 26)) {return true;} else {return false;}
	}
	
	public void showPart() {
		System.out.println();
		System.out.println("Item #:               "+partNumber);
		System.out.println("Description:          "+description);
		System.out.println("Quantity:             "+quantity);
		System.out.println("Price Per Unit:       "+unitPrice);
		System.out.println("Reorder Point:        "+reorderPoint);
	}
	
	public boolean checkPartNum(String partNum) {
		if ((partNum.length() == 6)) {
			if (Character.isLetter(partNum.charAt(0))) {
				if (Character.isLetter(partNum.charAt(1))) {return true;} else {return false;}
			} else {return false;}
		} else {return false;}
	}
}

