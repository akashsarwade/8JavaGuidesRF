package com.udemy.java8.functionl.Intrface.with.lambda;

@FunctionalInterface
interface Shape {

	void draw();
}

//This is the old way and standard way to write code method overriding

/*Circle Example
 * class Circle implements Shape {
 * 
 * @Override public void draw() { System.out.println("Circle Draw"); } }
 */

/*Triangle Example
 * class Triangle implements Shape {
 * 
 * @Override public void draw() { System.out.println("Triangle Draw"); } }
 */


/*Square Example
 * class Square implements Shape {
 * 
 * @Override public void draw() { System.out.println("Square Draw"); } }
 */
public class EgNoParameter {

	public static void main(String[] args) {
//1. This is here we replace above method into Java 8 feature lambda expression

		// this is we replace above methods into lambda expression.
		// here Shape is a Functional Interface
		// rectangle is a reference variable
		Shape rectangle = () -> System.out.println("rectangle Drawed");

		rectangle.draw();// calling draw method using reference variable

		Shape circle = () -> System.out.println("Circle is Big");
		circle.draw();

		Shape tringle = () -> System.out.println("Tringle has 3 eadges");
		tringle.draw();

	}
}
