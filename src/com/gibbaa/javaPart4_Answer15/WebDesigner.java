package com.gibbaa.javaPart4_Answer15;

public class WebDesigner extends Designer {

	public WebDesigner(String firstnameInput, String lastnameInput) {
		super(firstnameInput, lastnameInput);
		this.setPosition("Web Designer");
	}
	
	public void webDesign() {
		System.out.println("I design website.");
	}

	public void writeHTML() {
		System.out.println("I can write HTML.");
	}
}
