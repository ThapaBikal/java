package com.arrays;

import java.util.Arrays;

public class AddingSortingTwoArrays {

	public static void addingSortingArrays(int[] arr1, int[] arr2) {

		// 1 creating new array of lenght arr1 + arr2
		int[] newArray = new int[arr1.length + arr2.length];

		// 2 copying all elements from arr1 to newArray
		for (int i = 0; i < arr1.length; i++) {
			newArray[i] = arr1[i];
		}
		// 3 copying all elements from arr2 to newArray
		int count = arr1.length;
		for (int j = 0; j < arr2.length; j++) {
			newArray[count] = arr2[j];
			count++;
		}
		// 4 sorting newArray
		for (int i = 0; i < newArray.length; i++) {
			for (int j = i + 1; j < newArray.length; j++) {

				// swapping elements
				int temp = newArray[i];
				if (newArray[i] > newArray[j]) {
					newArray[i] = newArray[j];
					newArray[j] = temp;
				}

			}

		}

		System.out.println(Arrays.toString(newArray));
	}

	public static void main(String[] args) {
		int[] arr1 = { 80, 50, 30, 20, 60 };
		int[] arr2 = { 70, 10, 40, 5 };

		addingSortingArrays(arr1, arr2);

	}

}
