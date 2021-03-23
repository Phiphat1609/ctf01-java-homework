package com.ctf01.javahomework.part4;

import java.util.ArrayList;

public class HomeWork14_ClassCasting {

	public static void main(String[] args) {
		// Homework: Class Casting
		Employee dang = new Employee("Dang", "Red", 10000);
		Employee ceo = new CEO("Captain", "Marvel", 30000);
		Programmer prog = new Programmer("Captain", "Mavel", 20000);
		CEO ceo2 = (CEO) ceo;
		//CEO ceo3 = new Employee("Captain", "Marvel", 30000);
		//CEO ceo4 = (CEO) dang;
		ArrayList<Employee> myList = new ArrayList<>();
		myList.add(ceo2);
		myList.add(dang);
		myList.add(prog);
		CEO ceo3 = (CEO) myList.get(0);
		Employee dang2 = myList.get(1);
		Programmer prog2 = (Programmer) myList.get(2);
		ceo3.hello();
		prog2.hello();
		dang2.hello();
	}

}
