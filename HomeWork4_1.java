package com.ctf01.javahomework.part1;

public class HomeWork4_1 {

	public static void main(String[] args) {
		// 1
		int score1 = 49;
		if (score1>=80) {
			System.out.println("1Good");
		}else if (score1>=50) {
			System.out.println("1Normal");
		}else {
			System.out.println("1Fail");
		}
		
		//2
		int score2 = 49;
		boolean isHandSome = true;
		if (score2>=80 || isHandSome) {
			System.out.println("2Good");
		}else if (score2>=50) {
			System.out.println("2Normal");
		}else {
			System.out.println("2Fail");
			}

	}

}
