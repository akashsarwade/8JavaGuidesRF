package com.udemy.java8.lambda;

public class LambdaExample1 {

	public void m1() {
		System.out.println("Hello");
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public int getLength(String s) {
		return s.length();
	}

//	()->System.out.println("Welcome to Lambda");

	public static void main(String[] args) {

//		() -> System.out.println("Zero parameter lambda");

		LambdaExample1 obj = new LambdaExample1();
		obj.m1();
		obj.add(134, 067);
		System.out.println(obj.getLength("kjkugjyfhgdx5678kyt"));
	}

}
