package com.gibbaa.javaPart3;

public class CEO extends Employee {   
    
	public CEO(String firstnameInput, String lastnameInput, int salaryInput) {
        super(firstnameInput, lastnameInput, salaryInput);
    }
    
    @Override
    public int getSalary() {
        return super.getSalary() * 2;
    }
    
    @Override
    public void hello() {
        System.out.println("Hi, nice to meet you. " + this.firstname + " !");
    }
}
