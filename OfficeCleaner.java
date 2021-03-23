package com.ctf01.javahomework.part4;

public class OfficeCleaner extends Employee{

	public OfficeCleaner(String firstName, String lastName, int salary) {
		super(firstName, lastName, salary);
	}
	
	public void work() {
		System.out.println("OfficeCleaner is working.");
		Clean();
		KillCoachroach();
		DecorateRoom();
		WelcomeGuest();
	}
	
	public void Clean() {
		System.out.println("OfficeCleaner "+this.firstName+" is cleaning.");
	}
	public void KillCoachroach() {
		System.out.println("OfficeCleaner "+this.firstName+" is killing a coachroach.");
	}
	public void DecorateRoom() {
		System.out.println("OfficeCleaner "+this.firstName+" is decorating a room.");
	}
	public void WelcomeGuest() {
		System.out.println("OfficeCleaner "+this.firstName+" is welcome a guest.");
	}
}
