package com.ctf01.javahomework.part1;

public class HomeWork4_5 {

	public static void main(String[] args) {
		// Lab 9 Continue with For Loop
		System.out.println("Lab 9 Continue with For Loop:");
  		//1
  		System.out.print("1) ");
  		for (int count = 20; count>0; count--) {
  			if (count==11) {
  				System.out.println();
  				System.out.println(count+" Continue for loop by continue..");
  				continue;
  			}
  			System.out.print(count+" Still in for loop...");	  			
  		}
  		System.out.println();
  		System.out.println("-----------------------------");
  		
  		// Lab 10 Continue with For Loop
  		System.out.println("Lab 10 Continue with For Loop:");
  	  	//1
  	  	System.out.print("1) ");
  	  	for (int i =1; i<=10; i++) {
  	  		if (i==2) {
  	  				continue;
  	  		}
  	  		System.out.print(i+" ");
  	  	}
  	  	System.out.println();
  		System.out.println("-----------------------------");

	}

}
