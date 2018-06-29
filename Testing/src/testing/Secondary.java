package testing;

//import java.util.Scanner;

public class Secondary {
	// private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int arr[][] = {

				{ 0, -4, -6, 0, -7, -6 }, { -1, -2, -6, -8, -3, -1 }, { -8, -4, -2, -8, -8, -6 },
				{ -3, -1, -2, -5, -7, -4 }, { -3, -5, -3, -6, -6, -6 }, { -3, -6, 0, -8, -6, 0 }

				/*
				 * {-1,-1,-1,0,0,0}, {0,-1,0,0,0,0}, {-1,-2,1,0,0,0}, {0,0,0,0,0,0},
				 * {0,0,0,0,0,0}, {0,0,0,0,0,0}
				 */
		};

		int max = arr[0][0] + arr[0][1] + arr[0][2] + arr[1][1] + arr[2][0] + arr[2][1] + arr[2][2];
		for (int row = 0; row < arr.length - 2; row++) {
			for (int col = 0; col < arr.length - 2; col++) {
				int tempMax = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row + 1][col + 1]
						+ arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
				if (max < tempMax) {
					max = tempMax;
				}
			}
		}

		System.out.println(max);
		// scan.close();
	}
}