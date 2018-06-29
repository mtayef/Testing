package testing;

import java.io.*;

public class Testing {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter radius: ");
		double radius = Double.parseDouble(br.readLine());
		System.out.println(calculateSphere(radius));
	}

	public static String calculateCircle(double radius) {
		final double pi = 3.14;
		double parimeter = 2 * pi * radius;
		double area = pi * radius * radius;

		return String.format("Parimeter is: %.02f and area is: %.02f", parimeter, area);
	}

	public static String calculateSphere(double radius) {
		final double pi = 3.14;
		double area = 4 * pi * radius * radius;
		double volume = (4 / 3) * pi * radius * radius * radius;
		return String.format("Sphere area is: %.02f and volume is: %.02f", area, volume);
	}

}
