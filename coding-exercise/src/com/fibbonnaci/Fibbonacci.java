package com.fibbonnaci;

public class Fibbonacci {

	public static void getFibb(int size) {

		int num1 = 0;
		int num2 = 1;
		int count = 0;
		// swap num with for loop
		while (count <= size) {
			System.out.print(num1 + " ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			count++;
		}

	}

	// recursive method
	public static void getMeFibb(int size) {

		int count = 0;
		while (count <= size) {
			System.out.print(fibb(count) + ",");
			count++;

		}
	}

	private static int fibb(int num) {

		if (num == 0)
			return 0;

		if (num == 1 || num == 2)
			return 1;

		return fibb(num - 1) + fibb(num - 2);

	}

	public static void main(String[] args) {
//		getFibb(7);

		getMeFibb(7);

	}

}
