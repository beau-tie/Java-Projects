
public class KilosToMiles {

	public static void main(String args []) {
		double kilos;
		double miles;
		
		System.out.println("Miles       Kilometers");
		 
		for (miles = 1; miles < 11; miles++) {
			
			kilos = miles * 1.609;
			
			System.out.printf("%f     %f", miles, kilos);
			System.out.println();
		}
	}	
}
