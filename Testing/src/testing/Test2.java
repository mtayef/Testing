package testing;

import java.util.Scanner;

public class Test2 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// inputing integer for length
		int n = scan.nextInt();
		scan.nextLine();

		// inputing Strings.
		String s = scan.nextLine();

		// splitting and making an array
		String[] str = s.split(" ");

		String even = "";
		String odd = "";

		int i = 0;
		while (i < n) { // word by word
			String t = str[i];

			int j = 0;
			while (j < t.length()) {// each word character by character
				if (j % 2 == 0) {
					even += t.charAt(j);
				} else {
					odd += t.charAt(j);
				}
				j++;
			}
			/*
			 * for (int j = 0; j < t.length(); j++) { // each word char by char if (j % 2 ==
			 * 0) { first += t.charAt(j); } else { second += t.charAt(j); } }
			 */
			System.out.println(even + " " + odd);

			// resetting so that it doesn't begin with previous letters
			even = "";
			odd = "";
			// incrementing for while loop
			i++;
		}
	}
}