package com.ctf01.javahomework.part4;

abstract class EarthlingAbstractClass {
	public int n = 1;
	public abstract void move();
	public abstract void eat();
	public void stand() {
		System.out.println("Stand still...");
	}
}
