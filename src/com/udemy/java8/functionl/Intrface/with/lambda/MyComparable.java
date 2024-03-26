package com.udemy.java8.functionl.Intrface.with.lambda;

@FunctionalInterface
interface ComparableDemo {

	public void compareTo(int a, int b);
}

public class MyComparable {

	public static void main(String[] args) {

		ComparableDemo cpr = (a, b) -> {
			if (a > b) {
				System.out.println("A is Big");
			} else {
				System.out.println("B is Big");
			}
		};
		cpr.compareTo(11, 2);
	}
}
