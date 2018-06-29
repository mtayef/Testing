package testing;

public class Four {
	public static void main(String args[]) {
		System.out.println(cylinderCalculation(4, 2));
	}
	public static String cylinderCalculation(double r,double h) {
		final double pi = 3.14;
		//surface area: 2piR(R+h)
		double area = 2*pi*r*(r+h);		
		double volume = pi*r*r*h;
		return String.format("The area is %.02f and volume is %.02f", area,volume);
	}
}
