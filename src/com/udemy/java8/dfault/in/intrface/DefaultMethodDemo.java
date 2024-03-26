package com.udemy.java8.dfault.in.intrface;

interface Vehicle {

	//This are the abstract methods
	String getBrand();

	String speedUp();

	String speedDown();
	
//	This is the feature we write default method in interface
	
	default void fuelEnd() {
		System.out.println("your vehicle fuel is near about finish");
	}

	default void seatBealt() {
		System.out.println("please wear the seat Belt");
	}
}

class Car implements Vehicle {

	@Override
	public String getBrand() {
		return "Porche";
	}

	@Override
	public String speedUp() {
		return "Car high speed is 380 ";
	}

	@Override
	public String speedDown() {
		return "car speed down is 98";
	}

}

public class DefaultMethodDemo {
	public static void main(String[] args) {

		Vehicle v = new Car();
		
		System.out.println(v.getBrand());
		System.out.println(v.speedDown());
		System.out.println(v.speedUp());
		v.seatBealt();
		v.fuelEnd();
	}
}	
