package moon;
class Moon {
	public static void main(String[] a) {
		double earthWeight;
		double moonWeight;
		
		earthWeight = 140;
		
		moonWeight = earthWeight *0.17;
		
		System.out.printf("Your earth weight is %d%n and then your"
				+ "moon weight would be %d%n",earthWeight, moonWeight);
	}
}