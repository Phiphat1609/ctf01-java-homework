package com.ctf01.javahomework.part2;

public class OS_iOS extends MobilePhone {

	public OS_iOS (String OSname, String Phonename) {
		super(OSname, Phonename);
	}
	public void AppStore() {
		System.out.println("Now "+this.Phonename+" going to AppSore..");
	}	
}
