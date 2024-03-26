package com.udemy.java8.functionl.Intrface.with.lambda;

@FunctionalInterface
interface Multiplication {

	public abstract void Mul(int a, int b);
	
}

public class LambdaExample3 {

	public static void main(String[] args) {

		Multiplication ml = (a, b) -> {
			int v = a * b;
			System.err.println("Multiplication is :" + v);
		};
		ml.Mul(12, 2);

		
		
	}
}
