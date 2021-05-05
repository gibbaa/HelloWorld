package com.gibbaa.javaPart2;

public class Answer9 {
	
	public static void main(String[] args) {
		/* 9.2 จงสร้าง class ชื่อMobilePhone เป็น Class แม่ที่อยู่บนสุดฐานที่สุดโดย
		 * MobilePhone มี Feature ดังนี้•MobilePhone -> PhoneCall(), SMS(),
		 * InternetSurfing()•มีโทรศัพท์มือถืออยู่ 4 รุ่น มี Feature (method)
		 * ต่างๆดังนี้•SamSung Galaxy Note 8 -> UseGearVR(), TransformToPC(), UsePen(),
		 * GooglePlay()•iPhoneX -> FaceID(), AppStore()•iPhone8 -> TouchID(),
		 * AppStore()•Samsung Galaxy S8 -> UseGearVR(), TransformToPC(),
		 * GooglePlay()•จงออกแบบ class ให้กับมือถือทั้ง4 รุ่นเพื่อให้เกิดการreuse แบบ
		 * inheritance ให้มากที่สุด(ใช้ extend)
		 */
		
		SamsungGalaxyNote8 phone1 = new SamsungGalaxyNote8("Phone 1", 10000);
		System.out.println("Name : " + phone1.name + "Price :" + phone1.price);
		phone1.phoneCall();
		phone1.sms();
		phone1.internetSurfing();
		phone1.googlePlay();
		phone1.transformToPC();
		phone1.useGearVR();
		phone1.usePen();
		
		IPhoneX phone2 = new IPhoneX("Phone 2", 30000);
		System.out.println("Name : " + phone2.name + "Price :" + phone2.price);
		phone2.phoneCall();
		phone2.sms();
		phone2.internetSurfing();
		phone2.appStore();
		phone2.faceID();
	}

}
