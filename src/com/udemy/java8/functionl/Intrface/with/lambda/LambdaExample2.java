package com.udemy.java8.functionl.Intrface.with.lambda;

interface Calculate {
	void Sum(int a, int b);
}

public class LambdaExample2 {

	public static void main(String[] args) {

		Calculate add = (a, b) -> {
			int asdd = a + b;
			System.out.println("The Addition of 2 Values is:" + asdd);
		};
		add.Sum(12, 45);
	}
}
