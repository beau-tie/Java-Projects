package payrate;
import java.util.Scanner;

public class taxCode 
{
	public static void main(String [] args)
	{
		Scanner PA = new Scanner (System.in);
		System.out.println("Enter your purchase amount(xx.xx): ");
		double purchase = PA.nextDouble();
		
		Scanner tax = new Scanner (System.in);
		System.out.println("Enter the tax code: ");
		int taxCode = tax.nextInt();
		
		double total = 0;
		double taxTotal = 0;
		
		if (taxCode < 4 && taxCode >= 0)
		{
			switch(taxCode)
			{
				case 0:
					taxTotal = 1; //		Unecessary 
					total = (purchase * taxTotal); // code, but proves the point that I can
					System.out.printf("Your total is: %d%n", total); // code it
					break;
				case 1:
					taxTotal = 1.03;
					total = (purchase * taxTotal);
					System.out.printf("Your total is: %d%n", total);
					break;
				case 2:
					taxTotal = 1.05;
					total = (purchase * taxTotal);
					System.out.printf("Your total is: %d%n", total);
					break;
				case 3:
					taxTotal = 1.07;
					total = (purchase * taxTotal);
					System.out.printf("Your total is: %d%n", total);
					break;
			}
		}
		else
		{
			taxTotal = 1.05;
			total = (purchase * taxTotal);
			System.out.printf("Your total is: %d%n", total);
		}
		PA.close();
		tax.close();
	}
}
