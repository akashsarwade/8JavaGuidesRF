package com.udemy.java8.method.reference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceDemo {

	public static int addition(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

//		1 Method reference to a static method
		// Lambda Expression
		Function<Integer, Double> fun = (input) -> Math.sqrt(input);
		System.out.println(fun.apply(7));

		// using method reference
		Function<Integer, Double> funMethodRefe = Math::sqrt;
		System.out.println(funMethodRefe.apply(8));

		// Lambda Expression
		BiFunction<Integer, Integer, Integer> biFunLambda = (a, b) -> MethodReferenceDemo.addition(11, 23);
		System.out.println(biFunLambda.apply(11, 454));

		// Using method reference
		BiFunction<Integer, Integer, Integer> buFun = MethodReferenceDemo::addition;
		System.out.println(buFun.apply(12, 456));
	}
}
