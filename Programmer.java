package com.ctfo1.javahomework.part3;

public class Programmer extends Employee{

	public Programmer(String firstName, String lastName, String position, int salary) {
		super(firstName, lastName, position, salary);		
	}
	
	public void createWebsite(String template, String title) {
		System.out.println(this.firstName+" is creating Website name: "+title+" template: "+template);
	}
	public void installWindows(String version, String productKey) {
		System.out.println(this.firstName+" is intalling Windows version: "+version+" Product Key:"+productKey);
	}

}
