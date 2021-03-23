package com.ctf01.javahomework.part4;

public class CEO extends Employee{

	public CEO(String firstName, String lastName, int salary) {
		super(firstName, lastName, salary);
	}
	
	public void work() {
		System.out.println("CEO is working.");
		Seminar();
		Hire();
		Golf();
		Fire();
	}
	
	public void Seminar() {
		System.out.println("CEO "+this.firstName+" is working on seminar.");
	}
	public void Hire() {
		System.out.println("CEO "+this.firstName+" is hiring someone.");
	}
	public void Golf() {
		System.out.println("CEO "+this.firstName+" is playing golf.");
	}
	public void Fire() {
		System.out.println("CEO "+this.firstName+" is fire at someone.");
	}
	@Override
	public void hello() {
		System.out.println("Hi, nice to meet you. "+this.firstName+"!");
	}
	
	public void orderWebsite(IWebsiteCreator creator) {
		creator.createWebsite("Some template", "Codecamp3");
	}
}
