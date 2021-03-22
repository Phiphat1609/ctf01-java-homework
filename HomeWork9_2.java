package com.ctf01.javahomework.part2;

public class HomeWork9_2 {

	public static void main(String[] args) {
		// Main Class for create a new mobile object
		System.out.println("Samsung Galaxy Note 8 Object...");
		System.out.println();
		SamsungGalaxyNote8 mySSGX8 = new SamsungGalaxyNote8();
		System.out.println("Phone: "+mySSGX8.Phonename);
		System.out.println("OS : "+mySSGX8.OSname);
		mySSGX8.PhoneCall();
		mySSGX8.SMS();
		mySSGX8.InternetSurfing();
		mySSGX8.UseGearVR();
		mySSGX8.TransformToPC();		
		mySSGX8.GooglePlay();
		mySSGX8.UsePen();
		System.out.println("------------------------------------------");
		
		System.out.println("iPhone X Object...");
		System.out.println();
		iPhoneX myiPX = new iPhoneX();
		System.out.println("Phone: "+myiPX.Phonename);
		System.out.println("OS : "+myiPX.OSname);
		myiPX.PhoneCall();
		myiPX.SMS();
		myiPX.InternetSurfing();		
		myiPX.AppStore();
		myiPX.FaceID();
		System.out.println("------------------------------------------");
		
		System.out.println("iPhone 8 Object...");
		System.out.println();
		iPhone8 myiP8 = new iPhone8();
		System.out.println("Phone: "+myiP8.Phonename);
		System.out.println("OS : "+myiP8.OSname);
		myiP8.PhoneCall();
		myiP8.SMS();
		myiP8.InternetSurfing();		
		myiP8.AppStore();
		myiP8.TouchID();
		System.out.println("------------------------------------------");
		
		System.out.println("Samsung Galaxy S8 Object...");
		System.out.println();
		SamsungGalaxyS8 mySSGXS8 = new SamsungGalaxyS8();
		System.out.println("Phone: "+mySSGXS8.Phonename);
		System.out.println("OS : "+mySSGXS8.OSname);
		mySSGXS8.PhoneCall();
		mySSGXS8.SMS();
		mySSGXS8.InternetSurfing();
		mySSGXS8.UseGearVR();
		mySSGXS8.TransformToPC();		
		mySSGXS8.GooglePlay();
		System.out.println("------------------------------------------");
			
	}
	
}
