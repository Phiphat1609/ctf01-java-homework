package com.ctfo1.javahomework.part3;

public class HomeWork12 {

	public static void main(String[] args) {
		CEO myCEO = new CEO("Krissada", "Chalermsook", "CEO", 50000);		
		System.out.println(myCEO.toString());
		System.out.println("GetSalary = "+myCEO.getSalary());
		myCEO.hello();
		System.out.println("-----------------------------------------");
		
		Employee myEmployee = new Employee("Phiphat", "Khammongkhon", "QC", 5000);
		System.out.println(myEmployee.toString());
		myEmployee.hello();
		System.out.println("-----------------------------------------");
		
		myCEO.fire(myEmployee);
		System.out.println("-----------------------------------------");
		
		Programmer myProgrammer = new Programmer("Surachai", "Praneerachlerd", "Programmer", 50000);
		System.out.println(myProgrammer.toString());
		System.out.println("GetSalary = "+myProgrammer.getSalary());
		System.out.println("-----------------------------------------");
		
		//Employee2 Constructor Overloading
		Employee2 my1Employee2 = new Employee2();
		System.out.println(my1Employee2.toString());
		System.out.println("-----------------------------------------");
		
		Employee2 my2Employee2 = new Employee2("Mr.A");
		System.out.println(my2Employee2.toString());
		System.out.println("-----------------------------------------");
		
		Employee2 my3Employee2 = new Employee2("Mr.B", "bb");
		System.out.println(my3Employee2.toString());
		System.out.println("-----------------------------------------");
		
		Employee2 my4Employee2 = new Employee2("Mr.C", "cc", 12000);
		System.out.println(my4Employee2.toString());
		System.out.println("-----------------------------------------");

	}

}
