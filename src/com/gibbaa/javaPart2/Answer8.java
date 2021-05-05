package com.gibbaa.javaPart2;

public class Answer8 {

public static void main(String[] args) {
	// 8. 
	// 8.1 ทดลองสร้างอาเรย์ 2 มิติ และวนลูปแล้ว print ให้ครบทุกจํานวน(หน้าที่แล้ว)
	int[][] twoD_Array = {
			{1,2,3}, {4,5}, {6, 7, 8}
	};
	for (int[] x : twoD_Array) {
		for (int y : x) 
			System.out.println(y);
	}
	
	for (int[] x : twoD_Array) {
		String value = "";
		for (int y : x) {
			value += y;
			}
		System.out.println(value);
	}
	
	
	// 8.2 ทดลองดึงค่าในอาเรย์ 2 มิติ เอาสมาชิกตัวสุดท้ายของแต่ละแถวจากการวนลูปมาบวกกัน 
	//      และแสดงผลลัพธ์จากการบวกกันบน Console	
	int sum = 0;
	for (int x = 0; x < twoD_Array.length; x++) {
		for (int y = 0; y < twoD_Array[x].length; y++) {
			if (y == twoD_Array[x].length - 1) {
				sum += twoD_Array[x][y];
			}
		}
	}
	
	System.out.println("SUM of last value in each low = " + sum);
		
	}
}
