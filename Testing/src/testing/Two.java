package testing;

public class Two {
	public static void main(String[] args) {
		System.out.println("distance to km is: " + milesToKM(10));
	}

	public static double milesToKM(double miles) {

		final double km = 1.609;

		double distance = miles * km;

		return distance;
	}

}
