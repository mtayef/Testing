package testing;

public class Temperature {
	/*
	 * [°C] = ([°F] - 32) × 5/9 [°F] = [°C] × 9/5 + 32
	 */
	public static void main(String[] args) {
		// System.out.printf("Farenheight to celsius is %.02f",farenheightToCelsius(0));
		System.out.printf("Celsius to farenheight is %.01f", celsiusToFarenheight(29));
	}

	public static double farenheightToCelsius(int f) {
		double celsius = (double) (f - 32) * 5 / 9;
		return celsius;
	}

	public static double celsiusToFarenheight(int c) {
		double farenheight = (double) c * 9 / 5 + 32;
		return farenheight;
	}
}