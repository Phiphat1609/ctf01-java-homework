package com.ctf01.javahomework.part2;

public class MobilePhone {
	public String OSname;
	public String Phonename;
	public MobilePhone(String OSname, String Phonename) {
		this.OSname = OSname;
		this.Phonename = Phonename;
	}
	public void PhoneCall() {
		System.out.println("Now "+this.Phonename+" is calling...");
	}
	public void SMS() {
		System.out.println("Now "+this.Phonename+" is sending SMS...");
	}
	public void InternetSurfing() {
		System.out.println("Now "+this.Phonename+" is InternetSurfing...");
	}
}
