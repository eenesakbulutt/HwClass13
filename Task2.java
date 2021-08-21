package com.syntax.class13;

public class Task2 {

	//Create a method that will say Hello in different language based on the country that will passed when method is executed.	
	
	
	
void printHello(String country) {	
	
	switch(country) {
	
	case "USA":
	
	System.out.println("Hello");
	
	break;
	
	case "Germany" :
		System.out.println("Halo");
	break;
	
	case "Turkey" :
		System.out.println("Merhaba");
		break;
		
	case "Russia" :
		System.out.println("Privet");
		break;
		default:
			System.out.println("Invalid country name");
	
	
	
	
	}
	
	
	
}
	
	
	
	
	
	
	
}
