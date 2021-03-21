package com.ctf01.javahomework.part1;

public class HomeWork2_2 {

	public static void main(String[] args) {		
		bark();//1
		System.out.println();
		//2
		float myFloat = 3.14f;
		int myInt = (int)myFloat; //a.Narrowing
		System.out.println("myFloat= "+myFloat);
		System.out.println("Convert->int:myInt= "+myInt);
		System.out.println();
		
		float myFloat2 = (float) myInt; //b.Widening
		System.out.println("myInt= "+myInt);
		System.out.println("Convert->float:myFloat2= "+myFloat2);		
		System.out.println();
		
		double myDouble = 24.123456789123456d;
		float myFloat3 = (float)myDouble; //c.Narrowing
		System.out.println("myDouble= "+myDouble);
		System.out.println("Convert->float:myFloat3= "+myFloat3);		
		System.out.println();
		
		char myChar = '@';
		int myInt2 = (int)myChar; //d.Widening
		System.out.println("myChar= "+myChar);
		System.out.println("Convert->int:myInt2= "+myInt2);	
		System.out.println();
		
		//3 final variable
		final String hello ="Hello";
		System.out.println("hello= "+hello);
		//hello = "World";
		//Error: The final local variable hello cannot be assigned
	}
	
	public static void bark() {//1
		String dogName ="Kuro";
		System.out.println("The Dog name = "+dogName+" bark");
	}
	
}
