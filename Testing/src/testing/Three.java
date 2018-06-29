package testing;

public class Three {
	public static void main(String[] args) throws Exception {
		// System.out.println("Total salary with bonus is "+bonusCalculation(40000,
		// 10));
		// System.out.println("integer of character is "+charToInt('A'));
		System.out.println(timeConverter(10, 18));
	}

	public static double bonusCalculation(double salary, double bonus) {
		double totalSalary = salary + bonus / 100 * salary;
		return totalSalary;
	}

	public static int charToInt(char x) {
		return x;
	}

	public static String timeConverter(double distance, double speed) {
		distance *= 1000;
		speed = speed * 1000 / 3600;
		double time = distance / speed;
		// 1hr = 3600 seconds
		int hours = (int) time / 3600;
		int min = (int) (time - hours * 3600) / 60;
		int sec = (int) (time - hours * 3600 - min * 60);
		return String.format("%02d:%02d:%02d", hours, min, sec);

	}
}
