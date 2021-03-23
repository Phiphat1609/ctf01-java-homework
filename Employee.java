package com.ctf01.javahomework.part4;

public class Employee {
	public String firstName;
	public String lastName;
	public int salary;
	
	public Employee(String firstName, String lastName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
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
		return this.firstName+" "+this.lastName+" "+this.salary;
		}	
}
