package com.gibbaa.javaPart3;

public class Employee {
	
	public   String firstname;
    public   String lastname;
    private  int salary;
    public   String position;
    
    public static void main(String[] args) {
    	// 13.2
    	// 13.2.1 เพิ่มตัวแปร
    	// 13.2.2 เขียน method เพิ่ม
    	// 13.3 ทดสอบว่า method checkPosition ทำงานถูกป่าว
    	// 13.3.1 สร้าง method main ขึ้นมา
    	// 13.3.2 สร้าง instance ของ Employee ขึ้นมาสักอัน
    	// 13.3.3 เรียก method checkPosition ของ Employee ที่สร้างขึ้น
    	Employee emp1 = new Employee("Evan", "Hanson", 12000, "Designer");
    	emp1.hello();
    	emp1.checkPosition();
    }
    
    // ( 12. • ทดลอง Constructor Overloading )
    public Employee() {
    	this.firstname = "";
    	this.lastname = "";
    	this.salary = 0;
    	this.position = "";
    }
    
    public Employee(String firstnameInput, String lastnameInput) {
    	this.firstname = firstnameInput;
    	this.lastname = lastnameInput;
    	this.salary = 0;
    	this.position = "";
    }
    
    public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
    	this.firstname = firstnameInput;
    	this.lastname = lastnameInput;
    	this.salary = salaryInput;
    	this.position = "";
    	
    }
   
    public Employee(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
        this.firstname = firstnameInput;
        this.lastname = lastnameInput;
        this.salary = salaryInput;
        this.position = positionInput;
    }
    
    public void setSalary(int newSalary) {
        
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void hello() {
        System.out.println("Hello "+this.firstname);
    }
    
    public void checkPosition() {
    	System.out.println(this.firstname + " " + this.lastname + " position is " + this.position);
    }
}


