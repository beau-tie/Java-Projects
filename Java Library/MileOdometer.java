package mileOdometer;
import java.util.Scanner;

public class MileOdometer {
	public static void main(String[] args) {
		double Odometer_reading1;
		double Odometer_reading2;
		double Gallons_used;
		double Miles_per_gallon;
		double Mile;

		Scanner odo1 = new Scanner(System.in);
		System.out.println("Enter beginning odometer reading: ");
		Odometer_reading1 = odo1.nextDouble();

		Scanner odo2 = new Scanner(System.in);
		System.out.println("Enter ending odometer reading: ");
		Odometer_reading2 = odo2.nextDouble();

		Scanner gal = new Scanner(System.in);
		System.out.println("Enter the number of gallons used: ");
		Gallons_used = gal.nextDouble();

		Mile = Odometer_reading2 - Odometer_reading1;
		Miles_per_gallon = Mile / Gallons_used;

		System.out.println("Your miles per gallon (mpg) for this trip was " + Miles_per_gallon);
		odo1.close();
		odo2.close();
		gal.close();

	}
}
