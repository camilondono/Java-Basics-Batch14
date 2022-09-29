package com.syntax.class13;

public class Dogg {
	// state 
	//attributes/properties/fields
	
	String name;
	String color;
	String breed;
	double weight;
	int age;
	
	// This are the beahviors of a dog
	//Methods Functions
	void bark() {
		System.out.println("Barking.....");
	}
	void sleep(){
		System.out.println("Dog is sleeping.....");
	}
	void run() {
		System.out.println("Dog is running..is..is.");
	}
	public static void main(String[] args) {
		// creating objects from a class
		Dogg dog1= new Dogg();
		//calling a behavior omn an object
		dog1.bark();
		dog1.sleep();
	}

}
