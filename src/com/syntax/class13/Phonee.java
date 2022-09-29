package com.syntax.class13;

public class Phonee {
	String make;
	String model;
	String color;
	int storage;
	double size;
	boolean cheap;
	void call() {
		System.out.println("calling....");
	}
	
	void takePicture() {
		System.out.println("Taking Pictures");
	}

    public static void main(String[] args) {
	//name of class variable name=new Name of class();
    Phonee iphone=new Phonee();
    iphone.make="Apple";
    iphone.model="Iphone14";
    iphone.color="Black";
    iphone.storage=128;
    iphone.size=6.8;
    iphone.cheap=false;
    System.out.println("make "+iphone.make+" Model "+iphone.model);
    iphone.call();
   
    System.out.println("-----------------");
    
    Phonee samsungPhone=new Phonee();
    samsungPhone.make="Samsung";
    samsungPhone.model="S22 Ultra";
    samsungPhone.color="Grey";
    samsungPhone.storage=256;
    samsungPhone.size=6.7;
    samsungPhone.cheap=false;
    System.out.println(iphone.make);
    System.out.println(samsungPhone.make);
    
    
    
    }

}
