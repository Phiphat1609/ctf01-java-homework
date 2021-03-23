package com.ctf01.javahomework.part4;

public class AI implements IWebsiteCreator{
	public String name;
	public String language;
	public AI (String nameInput, String langugeInput) {
		this.name = nameInput;
		this.language = langugeInput;
	}
	@Override
	public void createWebsite(String template, String titleName) {
		System.out.println(this.language+" automated setup template: "+template);
		System.out.println(this.language+" automated setup Title name: "+titleName);
	}

}
