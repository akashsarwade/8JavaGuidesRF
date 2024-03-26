package com.udemy.java8.lambda;

public class Example2 {
	public static void main(String[] args) {

		int[] a = { 1, 0, 1, 1, 1, 0, 0, 0 };

		int countZero = 0;
		int countOne = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 0) {
				countZero++;

			} else if (a[i] == 1) {
				countOne++;
			}

		}
		System.out.println(countZero);
		System.out.println(countOne);

	}
}
