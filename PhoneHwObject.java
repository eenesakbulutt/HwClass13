package com.syntax.class13;

public class PhoneHwObject {
String name;
String color;
int model;
int camera;
void ringing(){
	
	System.out.println(name+ " is ringing right now");
}
	
void isMute()	{
	System.out.println(name+ "'s mode is silence");
}
	
void old ()	{
	System.out.println(name+ " has "+ camera+" inc");
}
	public static void main(String[] args) {
		
		
	PhoneHwObject iphone= new PhoneHwObject();
	
	iphone.name="iphone 12";
	iphone.color="white";
	iphone.camera=12;
	iphone.model=2020;	
	
	iphone.isMute();
		
	PhoneHwObject Android=new PhoneHwObject();
	
	Android.name="Samsung";
	Android.color="blue";
	Android.camera=9;
	Android.model=2010;
		
	Android.old();	
	
	PhoneHwObject Nokia=new PhoneHwObject();

	Nokia.name="Nokiamemo";
	Nokia.model=3310;
	Nokia.color="blue";
		
	Nokia.ringing();	
		
		
		

	}

}
