package com.gibbaa.javaPart1;

public class Answer2 {
	
	public static void main(String[] args) {
		// 2.1
		// 2.1.1 ลอง Comment ทั้งแบบSingle Line และ Multiple Line
		//comment
		
		/* This
		 * is
		 * comment
		 */
		
		
		// 2.1.2 ประกาศตัวแปรประเภทต่างๆ 
			// a.int 
			int num = 20;
		
			// b.boolean
			boolean isTrue = true;
		
			// c.String 
			String str = "Hello";
		
			// d.(Optional) หาตัวแปรประเภทอื่นๆเองอีกสัก 2 ประเภทใน google
			double floatNum = 0.0d;
			char myChar = 'G';
	
			
		// 2.1.3 Print ทุกๆ ตัวแปร จากข้อ 2 ออกมา ในรูปแบบ “This is a String ” + variable
			System.out.println("This is a int " + num);
			System.out.println("This is a boolean " + isTrue);
			System.out.println("This is a String " + str);
			System.out.println("This is a double " + floatNum);
			System.out.println("This is a char " + myChar);		
		
			
			
		// 2.2
		/* 2.2.1 ประกาศ method ชื่อว่าbark ขึ้นมาแล้วเอา method main ไปเรียก method bark
		 * โดย method bark ให้มี local variable ชื่อdogName ที่กาหนดชื่อหมาเป็นอะไรก็ได้
		 * แล้วก็ให้print ว่า “The Dog name = xxxbark”
		 */
			String dogName = "Choco";
			bark(dogName);
			primitiveConvert();
	}
	
	
	// ( 2.2.1 )
	public static void bark(String dogName) {
		System.out.println("The dog name = " + dogName + " bark");
	}
	
	
	// 2.2.2 ให้ลองเปลี่ยนค่าprimitive แล้ว print ออกมาโดยให้เปลี่ยนจาก
	public static void primitiveConvert() {
		// a.float -> int
		float newFloat = 5.55f;
		int newInt = (int) newFloat; 
		System.out.println("newFloat value: "+ newFloat);
		System.out.println("newInt value: "+ newInt); 
		
		//b.int -> float 
		int myInt = 10;
		float myFloat = myInt;
		System.out.println("myInt value: "+ myInt);
		System.out.println("myFloat value: "+ myFloat);
		
		//c.double -> float
		double myDouble = 0.3d;
		float otherFloat = (float) myDouble;
		System.out.println("myDouble value: "+ myDouble); 
		System.out.println("otherFloat value: "+ otherFloat); 
		
		//d.char -> int
		char myChar = 'G';
		int otherInt = myChar;
		System.out.println("myChar value: "+ myChar); 
		System.out.println("otherInt value: "+ otherInt); 
		
	/* 2.2.3 ทดลองประกาศ final variable ชื่อhello ให้มีค่า = “Hello”
	 * แล้วบรรทัดถัดมาลองไป Assign ค่าใหม่ให้ตัวแปรนี้เป็นค่า“World” แล้วลองดู run
	 * แล้วดูว่าเกิดไรขึ้น?
	 */
		final String hello = "Hello";
		// hello = "World";  // error
		System.out.println(hello);
	}	
}
