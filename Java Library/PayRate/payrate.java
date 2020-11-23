package payrate;
import java.util.Scanner;

public class payrate 
{
	public static void main(String [] args)
	{
		// Enter the ID, compile it into an Array, check if 4 numbers are entered
		Scanner iden = new Scanner(System.in);
		System.out.println("Enter your 4 digit employee number, "
				+ "each number seperated by a space: ");
		String id = iden.nextLine();
		String [] nums = id.split(" ");
		
		if (nums.length == 4 ) 
		{
			Scanner PR = new Scanner (System.in);
			System.out.println("Enter your payrate(xx.xx): ");
			double payrate = PR.nextDouble();
		
			if (payrate >= 25.00)
			{
				System.out.println("Your payrate cannopt exceed $25.00");
			}
			else
			{
				Scanner hour = new Scanner (System.in);
				System.out.println("Enter your hours worked");
				int hourWorked = hour.nextInt();
				
				if (hourWorked >= 60)
				{
					System.out.println("You cannot work more than 60 hrs / week");
					System.out.println("Please see a manager");
				}
				else
				{
					System.out.printf("Your ID is: %d%n", id);
					System.out.printf("Your Payrate is: %d%n", payrate);
					System.out.printf("Your hours worked is: %d%n", hourWorked);
					System.out.print("Your weekly pay is: " + (payrate * hourWorked));
				}
				PR.close();
				hour.close();
			}
		}
		else
		{
			System.out.println("Enter only 4 digits, seperated by spaces.");
		}
		iden.close();
		
		
	}
}
