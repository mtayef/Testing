package testing;
import java.util.Scanner;

public class Test4 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int n = scan.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scan.nextInt();
		}
		String reverse = "";
		for (int i = n - 1; i >= 0; i--) {
			reverse += nums[i];
		}
		System.out.println(reverse);
		scan.close();
	}
}
