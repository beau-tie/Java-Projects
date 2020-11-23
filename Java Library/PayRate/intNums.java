package payrate;
import java.util.Scanner;

public class intNums 
{
	public static void main(String [] args)
	{
		Scanner number = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 5: "); 
		// I use 1-5 to keep the program
		// short, if this were a live application, 
		// any number would suffice
		int num = number.nextInt();
		int sum = 0;
		
		Scanner addnums = new Scanner(System.in);
		System.out.printf("Enter %d additional integers seperated by spaces\n", num);
		String ads = addnums.nextLine();
		
		String [] a = ads.split(" ");
		
		int [] numbers = new int [a.length];
		
			for (int i=0; i < a.length; i++)
			{
				numbers[i] = Integer.parseInt(a[i]);
				while (i <= numbers[i])
				{
					sum += numbers[i];
					i++;
				}
			}
			System.out.printf("The sum of the integer and additional integers is"
					+ "%d", sum);
			number.close();
			addnums.close();
	}
}
