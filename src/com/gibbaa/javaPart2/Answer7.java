package com.gibbaa.javaPart2;

public class Answer7 {

public static void main(String[] args) {
	// 7. กําหนด String เป็นดังนี้String1 = ‘You and Me’ , String2 = ‘ you and me '
	// 7.1 ทดลองเปรียบเทียบ String 2 String ว่าเป็นค่าเดียวกันหรือไม่
	String str1 = "You and Me";
	String str2 = " you and me ";
	System.out.println(str1.endsWith(str2));
		
	// 7.2 ใช้คําสั่งค้นหาคําในString และแสดงคําที่ค้นหาบนหน้าจอ
	String searchText = "and";
	if (str1.contains(searchText) == true) 
		System.out.println("String \"" + str1 + "\" has \"" + searchText + "\" in it." );	

	// 7.3 ใช้คําสั่งหาความยาวของString นั้นและแสดงค่าความยาวString 
	System.out.println("str1.length() = " + str1.length());
		
	// 7.4 ใช้คําสั่งตัดข้อความหรือตัดString ตําแหน่งที่1-4 ออก
	String cutText = str1.substring(0, 4);
	System.out.println("str1 index 0-4 is " + "\"" + cutText + "\"");
		
	// 7.5 ใช้คําสั่งตัดช่องว่างของประโยค
	str1 = str1.replaceAll(" ", "");
	System.out.println(str1);
		
	// 7.6 ใช้คําสั่งเปลี่ยนString เป็นพิมพ์ใหญ่ทั้งหมด
	System.out.println(str1.toUpperCase());
		
	// 7.7 ใช้คําสั่งเปลี่ยนString2 เป็นพิมพ์ใหญ่ทั้งหมดและไม่มีช่องว่างซ้ายขวา
	//     ด้วยการเขียนcode แค่บรรทัดเดียว (ใช้ Chaining นั่นเอง)	
	System.out.println("str2 = \"" + str2 + "\"");
	System.out.println("str2 = \"" + str2.toUpperCase().trim() + "\"");
	}
}
