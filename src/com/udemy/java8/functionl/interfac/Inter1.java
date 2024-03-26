package com.udemy.java8.functionl.interfac;


public abstract class Inter1 {

	public abstract void m1();
	
	public  void m2() {
//		System.out.println("Welcome to Default method in functional interface");
	}
	
	public static void m3() {
		System.out.println("Welcome to static method in functional interface");
	}
	
	public static void main(String[] args) {
		
		Inter1.m3();
		
	}
}
