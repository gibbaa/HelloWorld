package com.gibbaa.javaPart4_Answer14;

import com.gibbaa.javaPart3.Employee;

public class Programmer2 extends Employee implements IWebsiteCreator, IWindowsInstaller {

	public Programmer2(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
	}
	
	@Override
	public void createWebsite(String template, String titleName) {
		System.out.println(this.firstname + " : create website");
		System.out.println("Setup template : " + template);
		System.out.println("Set title : " + titleName);
		
	}

	@Override
	public void formatWindows(String drive) {
		System.out.println(drive);
	}

	@Override
	public void installWindows(String version, String productKey) {
		System.out.println(version + "Key : " + productKey);
	}

	@Override
	public int getLastInstalledWindowsVersion() {
		return 0;
	}


}
