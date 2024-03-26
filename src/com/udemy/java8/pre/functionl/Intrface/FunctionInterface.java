package com.udemy.java8.pre.functionl.Intrface;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer> {

	@Override
	public Integer apply(String s) {
		return s.length();
	}

}

public class FunctionInterface {

	public static void main(String[] args) {

		Function<String, Integer> function = (String s) -> s.length();
		System.out.println(function.apply("Akash Sarwade"));

	}

}
