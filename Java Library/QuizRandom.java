package quiz;
import java.util.Scanner;


public class QuizRandom {
	public static void main(String [] args) {
		int score = 0;
		int tQuestions = 10;
		int studentAns = 0;
		int quizAns = 0;
		Scanner studentAnswer = new Scanner(System.in);
		
		for (int p = 0; p<tQuestions; p++)
		{
			System.out.println("Your Answer:");
			int randNum1 = (int) (Math.random()*50);
			int randNum2 = (int) (Math.random()*50);
			
			int randOp = (int) (Math.random() * 5);
			
			char mathOp = 'a';
			
			switch (randOp) {
			case 0:
				mathOp = '+';
				break;
			case 1:
				mathOp = '-';
				break;
			case 2:
				mathOp = '*';
				break;
			case 3:
				mathOp = '/';
				break;
			case 4:
				mathOp = '%';
				break;
			}
			System.out.print("randNum");
			System.out.print("randOp");
			System.out.print("randNum");
			
			studentAns = studentAnswer.nextInt();
			
			if(mathOp == '+') {
				quizAns = (randNum1 + randNum2);
				System.out.println("Answer: "+ quizAns);}
			else if(mathOp == '-') {
				quizAns = (randNum1 - randNum2);
				System.out.println("Answer: "+ quizAns);}
			else if(mathOp == '*') {
				quizAns = (randNum1 * randNum2);
				System.out.println("Answer: "+ quizAns);}
			else if(mathOp == '/') {
				quizAns = (randNum1 / randNum2);
				System.out.println("Answer: "+ quizAns);}
			else if(mathOp == '%') {
				quizAns = (randNum1 % randNum2);
				System.out.println("Answer: "+ quizAns);}
			
			if (studentAns == quizAns)
			{
				score += 1;
			}
			else
			{
				score += 0;
			}
		}
		studentAnswer.close();
		System.out.println("Total score is " + score);
		if (score >= 7) {
			System.out.println("Congratz, you passed.");
		}
		else {
			System.out.println("You did not pass, try again.");
		}
	}
}
