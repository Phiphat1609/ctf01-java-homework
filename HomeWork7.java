package com.ctf01.javahomework.part2;

public class HomeWork7 {

	public static void main(String[] args) {
		// Lab 12 String Methods
				String String1 = "You and Me";
				String String2 = " you and me ";				
				
				//1 String.equals(String) Method
				System.out.print("1)");
				System.out.println(String1.equals(String2));
				System.out.println("-----------------------");
				
				//2 String.contain(String) Method
				System.out.print("2)");
				System.out.println(String1.contains("and"));
				System.out.println("-----------------------");
				
				//3 String.length() Method
				System.out.print("3)");
				System.out.println("String1 lenght = "+String1.length());
				System.out.println("String2 lenght = "+String2.length());
				System.out.println("-----------------------");
				
				//4 String.substring(start, stop) Method
				System.out.print("4)");
				System.out.println(delString(String1,1,4));
				System.out.println("-----------------------");
				
				//5 String.trim() Method
				System.out.print("5)");
				String String2trimed = String2.trim();
				System.out.println(String2trimed);
				System.out.println("-----------------------");
				
				//6 String.toUpperCase() Method
				System.out.print("6)");
				System.out.println(String2.toUpperCase());
				System.out.println("-----------------------");
				
				//7 Chaining Method: String.trim().toUpperCase();
				System.out.print("7)");
				System.out.println(String2.toUpperCase().trim());
				System.out.println("-----------------------");
				
				//Lab 12 Optional : Name-Surname by Last char of surname is upper case
				System.out.println("Optional Lab 12) ");
				String myName = "Phiphat Khammongkhon";
				System.out.println(myName);
				System.out.println(ChngName(myName));
				System.out.println("-----------------------");
	}
	static String delString(String Str, int Start, int Stop) {
		String finalString ="";
		finalString = Str.substring(0,Start) + Str.substring(Stop);
		return finalString;
	}
	
	static String ChngName(String name) {
		String finalString ="";
		finalString = name.toLowerCase().substring(0,name.length()-1)+
				name.substring(name.length()-1,name.length()).toUpperCase();
		return finalString;
	}
}
