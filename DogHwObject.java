package com.syntax.class13;

public class DogHwObject {

	String color;
	String name;
	int age;
	char gender;

void sleep() {	
	System.out.println(name+ " is sleeping a lot");
}
		
void eat()	{
	System.out.println(name+ " is easting right now");
}

	public static void main(String[] args) {
		
	DogHwObject Husky= new DogHwObject();
	
	Husky.color="Yellow";
	Husky.name="Papa";
	Husky.age=23;	
	Husky.gender='M';	
		
	Husky.sleep();

	DogHwObject Labrador=new DogHwObject();
	
	Labrador.name="Reis";
	Labrador.color="Brown";
	Labrador.age=12;
	Labrador.gender='F';
	
	Labrador.eat();

	DogHwObject Bulldog=new DogHwObject();
	
	Bulldog.name="Zombi";
	Bulldog.color="Yellow";
    Bulldog.age=10;
    Bulldog.gender='M';
	
	Bulldog.eat();
	Bulldog.sleep();
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
	}

}
