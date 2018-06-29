package testing;

import java.util.Scanner;

public class Test3 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		solution();
		scan.close();
	}

	public static void solution() {

		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int s = scan.nextInt();
			for (int j = 0; j < s; j++) {
				System.out.print(j);
			}
		}
	}
}