package com.ctf01.javahomework.part4;

public class HomeWork14_PrimitiveCasting {

	public static void main(String[] args) {
		// Homework: Primitive Type Casting
		System.out.println("Casting: Windening int-->float");
		int myInt = 5;
		float myFloat = myInt; // Widening
		System.out.println("myInt value: " + myInt);
		System.out.println("myFloat value: " + myFloat);
		System.out.println("-------------------------");

		System.out.println("Casting: Narrowing float-->int");
		float newFloat = 5.5f;
		int newInt = (int) newFloat; // Narrowing
		System.out.println("newFloat value: " + newFloat);
		System.out.println("newInt value: " + newInt);
		System.out.println("-------------------------");

		System.out.println("Casting: Overflow int-->byte");
		int otherInt = 130;
		byte myByte = (byte) otherInt; // Overflow
		System.out.println("otherInt value: " + otherInt);
		System.out.println("myByte value: " + myByte);
		System.out.println("-------------------------");

	}
}
