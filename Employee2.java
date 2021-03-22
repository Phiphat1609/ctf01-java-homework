package com.ctfo1.javahomework.part3;

public class Employee2 {
	public String firstName;
	public String lastName;
	public int salary;
	
	public Employee2() {		
		this.firstName = "Anonymous";
		this.lastName = "Anonymous";
		this.salary = 9000;
	}
		
	public Employee2(String firstName) {		
		this();
		this.firstName = firstName;		
	}
	public Employee2(String firstName, String lastName) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Employee2(String firstName, String lastName, int salary) {		
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
		return this.firstName+" "+this.lastName+" "+this.salary;}

}
