package com.gibbaa.javaPart2;

public class SamsungGalaxy extends AndroidPhone {
	
	public SamsungGalaxy(String name, int price) {
		super(name, price);
	}
	
	public void useGearVR() {
		System.out.println("Use Gear VR");
	}
	
	public void transformToPC() {
		System.out.println("Transform to PC");
	}
}
