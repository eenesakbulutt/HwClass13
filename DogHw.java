package com.syntax.class13;

public class DogHw {

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
		
	DogHw Husky= new DogHw();
	
	Husky.color="Yellow";
	Husky.name="Papa";
	Husky.age=23;	
	Husky.gender='M';	
		
	Husky.sleep();

	DogHw Labrador=new DogHw();
	
	Labrador.name="Reis";
	Labrador.color="Brown";
	Labrador.age=12;
	Labrador.gender='F';
	
	Labrador.eat();

	DogHw Bulldog=new DogHw();
	
	Bulldog.name="Zombi";
	Bulldog.color="Yellow";
    Bulldog.age=10;
    Bulldog.gender='M';
	
	Bulldog.eat();
	Bulldog.sleep();
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
	}

}
