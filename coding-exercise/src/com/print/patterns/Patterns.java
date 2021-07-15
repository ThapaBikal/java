package com.print.patterns;

public class Patterns {

	/*
	 **
	 ***
	 ****
	 *****/
	public static void rightTriangle(int n) {

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	/*****  
	 **** 
	 ***
	 ** 
	 */
	public static void rightDecreasingTriangle(int n) {

		for (int i = 0; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	/*
	     *
	    ** 
	   *** 
	  ****/
	public static void leftTriangle(int n) {

		for (int i = 0; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	/*
	  *
	 ***
	*****
	*******
	 */

	public static void triangle(int n) {

		for (int i = 0; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(i);
			}

			for (int l = 1; l <= i; l++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		rightTriangle(7);
//      rightDecreasingTriangle(7);
//		leftTriangle(7);
		triangle(7);

	}

}
