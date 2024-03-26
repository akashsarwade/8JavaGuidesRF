package com.udemy.java8.stream.api;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

class Employee {

	private int id;
	private String name;
	private float salary;
	private Date joinDate;

	public Employee(int id, String name, float salary, 	Date joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joinDate = joinDate;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}

public class FindMaxSal {

	public static void main(String[] args) throws ParseException{
		// Q Find the employee who has maximum salary?
		
//		SimpleDateFormat date=new SimpleDateFormat("dd-MM-yyyy");
//		Date
//		
////		List<Employee> emp = Arrays.asList(
////				new Employee(1, "Ram", 39000.7f, "01-02-2022"),
////				new Employee(2, "Sham", 21000.3f),
////				new Employee(3, "John", 31000.5f),
////				new Employee(4, "kiran", 35000.8f),
////				new Employee(5, "sharan", 12000.9f));
////
////		Employee sal = emp.stream().max((a, b) -> Double.compare(a.getSalary(), b.getSalary())).get();
//		System.out.println(sal);
	}
}
