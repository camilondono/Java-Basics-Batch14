package com.syntax.class13;

public class Dog {


	String name;
	String breed;
	String color;
	int age;
	boolean active=true;
	String size;
	double weight;
	public static void main(String[] args) {
		
	
	Dog dog1=new Dog();
	
	dog1.name="Sharky";
	dog1.breed="Husky";
	dog1.color="White and Gray";
	dog1.age=4;
	dog1.active=true;
	dog1.weight=70.0;
	dog1.size="Large";
	System.out.println("the dog's name is "+dog1.name+ " his breed is "+dog1.breed+" and its weight is "+dog1.weight+"lb and its color is "+dog1.color+".");
	
	Dog dog2=new Dog();
	
	dog2.name="Tobby";
	dog2.breed="English Bull Dog";
	dog2.color="White and Brown";
	dog2.age=6;
	dog2.active=false;
	dog2.weight=55.0;
	dog2.size="medium";
	
	System.out.println("the dog's name is "+dog2.name+" he is "+dog2.age+" years old and its color is "+dog2.color+" is he an actice dog? "+dog2.active+" is not an active dog because his breed is "+dog2.breed+".");

	Dog dog3=new Dog();
	
	dog3.name="Taro";
	dog3.breed="Labrador";
	dog3.color="Brown";
	dog3.age=3;
	dog3.active=true;
	dog3.weight=75.0;
	dog3.size="medium to large";
	
	System.out.println("The dog name is "+dog3.name+". is the the dog an active dog? "+dog3.active+" because his breed is a "+dog3.breed+" and he loves to swim and its size is "+dog3.size+".");
	System.out.println();
	}
}