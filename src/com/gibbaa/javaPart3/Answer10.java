package com.gibbaa.javaPart3;

public class Answer10 {

	public static void main(String[] args) {
		// 10.3 ทดลองสร้าง Array จาก Class Employee
		
		Employee em1 = new Employee("A", "Alpha", 20000);
		Employee em2 = new Employee("B", "Beta", 11000);
		Employee em3 = new Employee("C", "Charlie", 9000);
		
		Employee[] employees = new Employee[3];
		employees[0] = em1;
		employees[1] = em2;
		employees[2] = em3;
		
		for (Employee data : employees) {
			System.out.println(data.firstname + " " + data.lastname + " " + data.getSalary());
		}
	}

}
