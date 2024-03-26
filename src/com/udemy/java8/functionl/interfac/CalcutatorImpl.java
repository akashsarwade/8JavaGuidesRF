package com.udemy.java8.functionl.interfac;

@FunctionalInterface
interface Calcutator {

//	public abstract void Switch();

	public abstract void Sum(int i);
}

public class CalcutatorImpl {

	public static void main(String[] args) {

//		Calcutator calcutator = () -> {
//			System.out.println("Switch Turn ON");
//		};

//		calcutator.Switch();

		Calcutator cl = (i) -> {
			System.out.println("Sum is:" + i);
		};
		cl.Sum(12);
		

	}

}
