package com.gibbaa.javaPart3;

public class Programmer extends Employee {
	/* 12.
	 * • สร้าง Class Programmer เซพเป็นไฟล์ Programmer.java
	 *   ขึ้นมาโดยสืบทอดจาก class Employee และเพิ่มMethod createWebsite(String
	 *   template, String titleName)และinstallWindows(String version, String
	 *   productKey)ทั้งสอง method ให้ใส่ void ไม่ต้อง return ค่า
	 * • ทดลองเรียก method getSarary() ใน instance ของ class Programmer
	 */
	
	public static void main(String[] args) {
		// ( • ทดลองเรียก method getSarary() ใน instance ของ class Programmer )
		Programmer programmer = new Programmer("Pro", "Grammer", 20000);
		System.out.println(programmer.getSalary());
	}
	
	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
	}

	public void createWebsite(String template, String titleName) {
		
	}
	
	public void installWindows(String version, String productKey) {
		
	}
	
}
