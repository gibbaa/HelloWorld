package com.gibbaa.javaPart4_Answer15;

import com.gibbaa.javaPart4_Answer15.Employee.EmploymentType;

public class Answer15 {

	public static void main(String[] args) {
		// 15.
		// 15.1 ทดลองสร้าง Abstract Class แล้วสืบทอดไป new ออกมา
		// 15.2 ทดลอง final keyword ใส่ทั้งตัวแปร, Method และ class
		// 15.3 ทดลอง Enum
		
			CEO ceo = new CEO("Boss", "Superbossy");
			ceo.info();
			ceo.setPosition("jjjjj");
			ceo.info();
			ceo.work();
			
			
			Designer staff1 = new Designer("Desi", "Signer");
			staff1.setEmploymentType(EmploymentType.PERMANANT);
			staff1.info();
			staff1.setPosition("Printing Designer");
			staff1.info();
			staff1.work();
			staff1.graphicDesign();
			staff1.photoShooting();
			ceo.paySalary(staff1);
			
			WebDesigner staff2 = new WebDesigner("Webby", "Dessiner");
			staff2.setEmploymentType(EmploymentType.DAILY);
			staff2.info();
			staff2.work();
			staff2.graphicDesign();
			staff2.webDesign();
			staff2.photoShooting();
			staff2.writeHTML();
			ceo.paySalary(staff2);
			
			WebProgrammer staff3 = new WebProgrammer("Pro", "Grammer");
			staff3.setEmploymentType(EmploymentType.TEMPORALY);
			staff3.info();
			staff3.work();
			staff3.graphicDesign();
			staff3.webDesign();
			staff3.photoShooting();
			staff3.writeHTML();
			staff3.writeJava();
			staff3.writeJavaScript();
			ceo.paySalary(staff3);			
	}

}
