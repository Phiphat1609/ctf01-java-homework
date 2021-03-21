package com.ctf01.javahomework.part1;

import java.util.Scanner;

public class HomeWork4_4 {
	
	public static void main(String[] args) {
		// Lab 6 While Loop
		System.out.println("Lab 6 While Loop:");
		//1
		System.out.print("1) ");
		int i =0;
		while(i<=10) {			
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		//2
		System.out.print("2) ");
		int sum = 0;
		i=0;
		while(i<=10) {			
			sum = sum + i;
			i++;
		}		
		System.out.println("Sum 1 to 10 = "+sum);
		
		
		//3
		System.out.print("3) ");
		i=0;
		while(i<=100) {			
			if ((i%12)==0) {
				System.out.print(i+" ");
				}
			i++;
		}
		System.out.println();		
		
		//4
		System.out.print("4) "); //foreach
		int intArray[] = {1,2,3,4,5};
		for(int counter:intArray) {
			System.out.print(counter+" ");
		}
		System.out.println("");
		System.out.println("-----------------------------");
		
		//Lab 7 Do While Loop
		System.out.println("Lab 7 Do While Loop:");
		//1
		System.out.print("1) ");
		i=20;
		do {
			System.out.print(i+" ");
			i--;
		}while(i>=1);		
		System.out.println("");
		
		//2
		System.out.print("2) ");
		int number;
		Scanner input = new Scanner(System.in);
	    do {
	    	System.out.print("Enter an odd integer for exit loop: ");
	        number = input.nextInt();
	        if ((number%2)==0) {
	        	System.out.println("You enter an even integer!!!");
	        	}
	    	} while ((number%2)==0);
	    // closing the scanner object
	    System.out.println("Ok,You enter an odd integer then exit the loop...");
	    input.close();	
	    System.out.println("-----------------------------");
	    
	  //Lab 8 Break with For loop
	  		System.out.println("Lab 8 Break with For loop:");
	  		//1
	  		System.out.print("1) ");
	  		for (int count = 20; count>=0; count--) {
	  			if (count==11) {
	  				System.out.println();
	  				System.out.println(count+" End for loop by break..");
	  				break;
	  			}
	  			System.out.print(count+" Still in for loop...");	  			
	  		}
	  		System.out.println("-----------------------------");
	}

}
