package project;

	public class Inventory {

		int quantity;
		String partNumber;
		String description;
		
		Inventory()
		{
			partNumber = "AA0000";
			description = "Test Item";
			quantity = 0;
		}
		
		Inventory(String pnum, String desc, int qty)
		{
			partNumber = pnum;
			description = desc;
			quantity = qty;
		}
		
		public void setQuantity(int qty) {quantity = qty;}
		public void setPartNumber(String pnum) {partNumber = pnum;}
		public void setDescription(String desc) {description = desc;}
		
		
		public void showPart() {
			System.out.println("Item #:               "+partNumber);
			System.out.println("Description:          "+description);
			System.out.println("Quantity:             "+quantity);
		}
	}