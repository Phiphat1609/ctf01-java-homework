package com.ctf01.javahomework.part4;

public class HomeWork15_Enum {

	public static void main(String[] args) {
		SteckClass mySteck = new SteckClass("FISH");
		mySteck.foodStatus = FoodStatus.Status.WELLDONE;
		
		System.out.println("My Steck is "+mySteck.meatType);
		System.out.println("I Like Steck "+mySteck.foodStatus);

	}

}
