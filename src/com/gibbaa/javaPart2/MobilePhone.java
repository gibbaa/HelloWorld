package com.gibbaa.javaPart2;

public class MobilePhone {
	/* จงสร้าง class ชื่อMobilePhone เป็น Class แม่ที่อยู่บนสุดฐานที่สุดโดย
	 * MobilePhone มี Feature ดังนี้•MobilePhone -> PhoneCall(), SMS(),
	 * InternetSurfing()
	 */
	public String name;
	public int price;
	
	public MobilePhone(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void phoneCall() {
		System.out.println("Phone Call");
	}
	
	public void sms() {
		System.out.println("SMS");
	}
	
	public void internetSurfing() {
		System.out.println("Internet Surfing");
	}
}
