package com.gibbaa.javaPart3;

public class Day10 {

    public static void main(String[] args) {
    	
    	/* 12. 
		 * • ทดลองสร้าง instance ของ class CEO และ class Employee ใน Method main ไฟล์
		 *   Day10.java
		 */   
    	
    	CEO ceo = new CEO("Boss", "Super", 30000);
    	Employee employee1 = new Employee("Em", "Ployee", 15000);
    	
    	ceo.hello();
    	System.out.println(ceo.getSalary());;
    	employee1.hello();
    	System.out.println(employee1.getSalary());;
    	
    	Employee employee2 = new Employee("Ann", "Gray");
    	employee2.hello();
    	System.out.println(employee2.getSalary());
    }
    
}   