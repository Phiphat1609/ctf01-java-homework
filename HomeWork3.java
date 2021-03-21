package com.ctf01.javahomework.part1;

public class HomeWork3 {

	public static void main(String[] args) {
		//1
		int i = 20;
		System.out.println("Start i = "+i);
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println("after i++; 5 times i = "+i);//a
		i--;
		i--;
		i--;
		i--;
		i--;
		System.out.println("after i--; 5 times i = "+i);//b
		
		//2 && with float variable
		float a = 3.14f;
		float b = 0.55f;
		System.out.println("a="+a+" b="+b);
		//if (a && b) {}
		//boolean floatBoolen = (a && b);
		//Error: The operator && is undefined for the argument type(s) float, float
		
		//3 || with char variable
		char ch1 ='a';
		char ch2 ='b';
		System.out.println("ch1="+ch1+" ch2="+ch2);
		//if (ch1 || ch2) {}
		//boolean charBoolean = (ch1 || ch2);
		//Error: The operator || is undefined for the argument type(s) char, char			

	}

}
