package com.ctf01.javahomework.part2;

public class HomeWork8 {

	public static void main(String[] args) {
		// Lab 13 Array
		// 1 Array: 2 Dimension Array
		int[][] twoDarray = { { 1, 3, 5 }, { 2, 4, 6 }, { 7, 9, 11 }, { 8, 10, 12 } };
		for (int[] row : twoDarray) {
			System.out.print("[ ");
			for (int item : row) {
				System.out.print(item + " ");
			}
			System.out.print("]");
			System.out.println();
		}
		System.out.println("-------------------------");

		// Loop in array for sum of the last element of each row
		int sumLast = 0;
		for (int[] row : twoDarray) {
			for (int i = 0; i < row.length; i++) {
				if (i == (row.length - 1)) {
					System.out.println("The Last item: " + row[i]);
					sumLast = sumLast + row[i];
				}
			}
		}
		System.out.println("Sum of the each last element of all rows = " + sumLast);
		System.out.println("-------------------------");
	}

}
