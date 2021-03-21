package com.ctf01.javahomework.part1;

public class HomeWork5 {

	public static void main(String[] args) {
		// Method without return and return value
		myMethod();
		System.out.println("-----------------------------------");
		System.out.println(myPlus(2,3));
	}
	public static void myMethod() {
		System.out.println("This is myMethod method without return any value");
	}
	public static int myPlus(int a, int b) {
		System.out.print("This is myPlus method with return integer value ");
		return a+b;
	}
}
