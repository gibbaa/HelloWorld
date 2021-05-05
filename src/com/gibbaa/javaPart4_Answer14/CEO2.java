package com.gibbaa.javaPart4_Answer14;

import com.gibbaa.javaPart3.Employee;

public class CEO2 extends Employee {
	
	public String templateNameInput;
	public String titleInput;
	
	public CEO2(String firstnameInput, String lastnameInput, int salary) {
		super(firstnameInput, lastnameInput, salary);
	}
	
	public void orderWebsite(IWebsiteCreator creator) {
		System.out.println(this.firstname + " order : ");
		creator.createWebsite(templateNameInput, titleInput);
	}

	
}
