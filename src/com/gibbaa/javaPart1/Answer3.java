package com.gibbaa.javaPart1;

public class Answer3 {
	
	public static void main(String[] args) {
	// 3.1 ประกาศ int i ให้มีค่า = 20
		int i = 20;
		
		// a. เรียก i++ 5 ครั้งแล้วprint ค่า i ออกมา
		for (int x = 0; x < 5; x++) {
			i++;
			System.out.println(i);
		}
	
		// b. เรียก --i 5 ครั้งแล้วprint ค่า i ออกมา 
		for (int x = 0; x < 5; x++) {
			--i;
			System.out.println(i);			
		}
	
		
	// 3.2 ทดลองใช้ && กับข้อมูลประเภท float 
		float float1 = 1.3f;
		float float2 = 2.5f;
		if ((float1 == 1.3f) && (float2 == 2.5f))
			System.out.println("float1 = " + float1 + " , float2 = " + float2);


	// 3.3 ทดลองใช้ || กับข้อมูลประเภท char
		char char1 = 'A';
		char char2 = 'b';
		if ((char1 == 'a') || (char2 == 'a'))
			System.out.println("char1 or char2 = a");
		else System.out.println("char1 or char2 is not \'a\'");
		if ((char1 == 'b') || (char2 == 'b'))
			System.out.println("char1 or char2 = \'b\'");
	}

}
