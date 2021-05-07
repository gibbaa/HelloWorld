package com.gibbaa.javaPart4_Answer15;

final public class WebProgrammer extends WebDesigner {

	public WebProgrammer(String firstnameInput, String lastnameInput) {
		super(firstnameInput, lastnameInput);
		this.setPosition("Web Programmer");
	}

	public void writeJava() {
		System.out.println("I can write Java.");
	}
	
	public void writeJavaScript() {
		System.out.println("I can write Java Script.");
	}
	
}
