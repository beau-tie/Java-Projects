package quiz;
import java.util.Scanner;


public class Quiz 
{
	public static void main(String [] args) {
		int score = 0;
		int tQuestion = 10;
		String question[] = {"8-13","14+12","16/4","8+18","The remainder of 17/4","5*4","27/9","4-7","20*4","13-4"};
	
		int ans[] = {8-13, 14+12, 16/4, 8+18, 17%4, 5*4, 27/9, 4-7, 20*4, 13-4};
		int studentans;
		Scanner student = new Scanner(System.in); {
	
			for (int x=0; x<tQuestion; x++)
			{
				System.out.println("Your answer: ");
				System.out.println(question[x]);
				studentans = student.nextInt();
		
				if (studentans == ans[x])
				{
					score += 1;
				}
				else
				{
					score += 0;
				}
			}
			System.out.println("Total score is " + score);
			if (score >= 7) {
				System.out.println("Congratz, you passed.");
			}
			else {
				System.out.println("You did not pass, try again.");
			}
		}
		student.close();
	}
}



