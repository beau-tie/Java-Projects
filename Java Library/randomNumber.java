package random;

import java.util.Random;
import java.util.Scanner;

public class randomNumber {
	public static void main (String[] args) {
		var guess = new Scanner(System.in);
		var Random_number = new Random();
		int correctNum = Random_number.nextInt(100);
		int success = 0;
	
		while (success==0) {
			
			System.out.println("Guess a number between 0 and 100");
			int userGuess = guess.nextInt();
			
			if (userGuess == correctNum) {
				success++;
				System.out.println("Congratz. That is the number!");
			}
			else if (userGuess<correctNum) {
				System.out.println("Higher. Try again.");
			}
			else if (userGuess>correctNum) {
				System.out.println("Lower. Try again.");
			}
		}
		guess.close();
	}
	
}
