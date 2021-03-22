package com.ctfo1.javahomework.part3;

public class Employee {
	
	public String firstName;
	public String lastName;
	public String position;
	public int salary;
	
	public Employee(String firstName, String lastName, String position, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.salary = salary;
	}
	
	public void hello() {
		System.out.println("Hello "+this.firstName);
	}
	
	public int getSalary() {
		return this.salary;
	}
	@Override
	public String toString() {
		return this.firstName+" "+this.lastName+" "+this.position+" "+this.salary;
		}
	public void checkPosition() {
		System.out.println(this.firstName+" position is : "+this.position);
	}
	
}
