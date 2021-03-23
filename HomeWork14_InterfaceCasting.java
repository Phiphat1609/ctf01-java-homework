package com.ctf01.javahomework.part4;

public class HomeWork14_InterfaceCasting {

	public static void main(String[] args) {
		// Homework: Interface Casting
		CEO ceo = new CEO("Captain", "Marvel", 30000);
		IWebsiteCreator dang = new Programmer("Dang","Red",10000);
		Programmer dang2 = (Programmer) dang;
		AI alphaGo = new AI("alphaGo", "Java");
		IWebsiteCreator alphaGo2 = alphaGo;
		
		ceo.orderWebsite(dang);
		System.out.println();
		ceo.orderWebsite(dang2);
		System.out.println();
		ceo.orderWebsite(alphaGo);
		System.out.println();
		ceo.orderWebsite(alphaGo2);
	}

}
