package com.udemy.java8.functionl.Intrface.with.lambda;

@FunctionalInterface
interface CallableDemo {
	
	public void call();
}

public class MyCollable {

	public static void main(String[] args) {
		CallableDemo cb = () -> {
			System.out.println("I am Callable Interafce and Callebale interface hs Call() Method.");
		};
		cb.call();
	}
}
