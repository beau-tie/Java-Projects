package stateTax;

import java.util.Scanner;

public class StateTax {
	public static void main (String [] args) {
		String sale;
		double Amount = 0.0;
		double taxHold = 0.0;
		double taxTotal = 0.0;
		double finalTotal = 0.0;
		
		String arrState[] = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA",
				"HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", 
				"MS", "M0", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", 
				"ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", 
				"VA", "WA", "WV", "WI", "WY", "DC"};
		
		
		double arrRate[] = {4.0, 0, 5.60, 6.50, 7.50, 2.90, 6.35, 0, 6.0, 4.0, 4.0, 6.0, 6.25, 
		7.0, 6.0, 6.50, 6.0, 4.0, 5.50, 6.00, 6.25, 6.0, 6.875, 7.0, 4.225, 0, 5.50,
                6.85, 0, 7.0, 5.25, 4.0, 4.75, 5.0, 5.75, 4.50, 0, 6.0, 
                7.0, 6.0, 4.0, 7.0, 6.25, 5.95, 6.0, 5.30, 6.50, 6.0, 5.0, 4.0, 5.75};
		
		Scanner sc = new Scanner(System.in);
		int hold = 0;
		
		System.out.print("Sale Location (State): ");
		sale = sc.nextLine();
		
		System.out.print("Sale Amount: ");
		Amount = sc.nextDouble();
		
		for (int i=0; i < arrState.length; i++)
		{
			if (sale.equals(arrState[i]))
			{
				hold = i;
			}
		}
		
		taxHold = (arrRate[hold]/100);
		taxTotal = (taxHold*Amount);
		finalTotal = (taxTotal + Amount);
		
		System.out.printf("State: " + arrState[hold]);
		System.out.printf("Sale Amount: " + Amount);
		System.out.printf("State Tax Rate: " + (arrRate[hold]/100));
		System.out.printf("Sales Tax: " + taxTotal);
		System.out.printf("Total: " + finalTotal);
		
		sc.close();
	}
}
