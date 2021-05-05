package com.gibbaa.javaPart1;


public class Answer5 {
	
	public static void main(String[] args) {
		/* 5.
		 * ทดลองสร้าง method แบบ Return และไม่ Return ค่า และเรียกใช้งาน method
		 * ที่สร้างขึ้นโดยให้แสดงผลลัพธ์บน Console
		 */
		String myStr = "Hello";
		String newStr = returnMethod(myStr);
		System.out.println(newStr);
		noReturnMethod();
	}
	
	public static String returnMethod(String str) {
		String outputStr = "returnMethod() return \"" + str + "\"";
		return outputStr;
	}
	
	public static void noReturnMethod() {
		System.out.println("This is no return method");
	}
}
