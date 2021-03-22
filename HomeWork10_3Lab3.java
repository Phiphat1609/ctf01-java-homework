package com.ctfo1.javahomework.part3;

public class HomeWork10_3Lab3 {

	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("FirstName"+(i+1), "LastName"+(i+1), "Position"+(i+1), (i+1)*10000);			
		}

		for (int i = 0; i < employees.length; i++) {
			System.out.println("Fistname: "+employees[i].firstName);
			System.out.println("Lastname: "+employees[i].lastName);
			System.out.println("Position: "+employees[i].position);
			System.out.println("Salary: "+employees[i].salary);
			System.out.println("----------------------------");
		}
	}

}
