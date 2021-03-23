package com.ctf01.javahomework.part4;

public class Programmer extends Employee implements IWebsiteCreator{

	public Programmer(String firstName, String lastName, int salary) {
		super(firstName, lastName, salary);		
	}
	
	public void work() {
		System.out.println("Programer is working.");
		CreateWebsite();
		FixPC();
		InstallWindows();
	}
	
	public void CreateWebsite() {
		System.out.println("Programmer "+this.firstName+" is creating a Website.");
	}
	public void FixPC() {
		System.out.println("Programmer "+this.firstName+" is fixing a PC.");
	}
	public void InstallWindows() {
		System.out.println("Programmer "+this.firstName+" is installing Windows.");
	}

	@Override
	public void createWebsite(String template, String titleName) {
		System.out.println("Setup template: "+template);
		System.out.println("Setup Title name: "+titleName);		
	}
	
}
