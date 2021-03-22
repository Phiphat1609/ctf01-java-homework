package com.ctf01.javahomework.part2;

public class OS_Android extends MobilePhone {
	
	public OS_Android (String OSname, String Phonename) {
		super(OSname, Phonename);
	}
	public void UseGearVR() {
		System.out.println("Now "+this.Phonename+" going to UseGearVR..");
	}
	public void TransformToPC() {
		System.out.println("Now "+this.Phonename+" going to TransformToPC..");
	}
	public void GooglePlay() {
		System.out.println("Now "+this.Phonename+" going to GooglePlay..");
	}

}
