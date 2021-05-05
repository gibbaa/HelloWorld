package com.gibbaa.javaPart1;

public class Answer4 {
	
	public static void main(String[] args) {

		/* 4.1 ประกาศตัวแปร score = อะไรก็ได้ 
		 * a. ถ้า score >= 80 ให้ print ว่า Good 
		 * b. ถ้า score >= 50 แต่น้อยกว่า 80 ให้ print ว่า normal 
		 * c. ถ้า score < 50 ให้ print ว่า fail
		 */
		int score = 20;
		boolean isHandSome = false;
		check(score, isHandSome);

		/* 4.2 จากข้อ 1 ให้ประกาศตัวแปร boolean ว่า isHandSome เพิ่มเข้ามาเป็นค่าอะไรก็ได้
		 * a.แก้โจทย์จาก ข้อ 2 ถ้าเกิด isHandSome = true แล้ว
		 * ไม่ว่าจะได้ score เท่าไหร่ ก็จะ print Good ตลอด
		 */
		isHandSome = true;
		check(score, isHandSome);
		
	}
	
	public static void check(int score, boolean isHandsome) {
		if (score >= 80 || isHandsome == true) {
			System.out.println("Good");
		}
		else if (score >= 50 && score < 80) 
			System.out.println("Normal");
		else 
			System.out.println("Fail");
			
	}
}
