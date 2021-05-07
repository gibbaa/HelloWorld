package com.gibbaa.javaPart4_Answer15;

public class Designer extends Employee {

	public Designer(String firstnameInput, String lastnameInput) {
		super(firstnameInput, lastnameInput);
		this.setPosition("Designer");
	}

	@Override
	public void work() {
		System.out.println("Work 5 days a week.");
	}
	
	@Override
	public void info() {
		System.out.println(this.firstname + " " + this.lastname + " : " + this.getPosition());
	}
	
	public void graphicDesign() {
		System.out.println("I design graphic printing stuff.");
	}
	
	public void photoShooting() {
		System.out.println("I can take a picture.");
	}

}
