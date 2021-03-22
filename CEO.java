package com.ctfo1.javahomework.part3;

public class CEO extends Employee {

	
	public CEO(String firstName, String lastName,String position, int salary) {
		super(firstName, lastName, position, salary);
	}
	
	@Override
	public int getSalary() {
		return super.salary*2;
	}
	@Override
	public void hello() {
		System.out.println("Hi, nice to meet you "+this.firstName+"!");
	}
	public void fire(Employee employee) {
		System.out.println(employee.firstName+" has been fired! by CEO "+this.firstName);
	}
	
}
