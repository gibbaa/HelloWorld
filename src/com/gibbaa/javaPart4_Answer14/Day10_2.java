package com.gibbaa.javaPart4_Answer14;

public class Day10_2 {
	public static void main(String[] args) {
		CEO2 ceo = new CEO2("Boss", "Super", 30000);
		Programmer2 dang = new Programmer2("Dang", "Reed", 20000);
		AI alphaGO = new AI("Alpha GO", "Java");
		
		ceo.templateNameInput = "Template X";
		ceo.titleInput = "Some Title";
		ceo.orderWebsite(dang);
		
		ceo.templateNameInput = "Template Auto";
		ceo.titleInput = "Website from AI";
		ceo.orderWebsite(alphaGO);
		
		dang.formatWindows("drive x");
		dang.installWindows("v.10", "xxxxxxxx123");
		System.out.println(dang.getLastInstalledWindowsVersion());
	}
}
