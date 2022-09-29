package com.syntax.class13;

public class Phone {

	public String make;
	public String model;
	String color;
	int memory;
	boolean touchscreen;
	double size;
	double weight;
	public int year;
	public int storage;
	
	public static void main(String[] args) {
	
	Phone pixel=new Phone();
	pixel.make="google";
	pixel.model="Pixel xl";
	pixel.color="Black";
	pixel.memory=64;
	pixel.touchscreen=true;
	pixel.weight=5.93;
	
	Phone iphone=new Phone();
	iphone.make="Apple";
	iphone.model="Iphone 14Pro";
	iphone.color="Metallic Green";
	iphone.memory=532;
	iphone.touchscreen=true;
	iphone.size=6.8;
	iphone.weight=7.27;
	
	Phone samsung=new Phone();
	samsung.make="Samsung";
	samsung.model="S22 Ultra";
	samsung.color="Rose Gold";
	samsung.memory=532;
	samsung.touchscreen=true;
	samsung.size=6.8;
	samsung.weight=8.08;
	
	System.out.println("Iphone is made by "+iphone.make+ " it weights "+iphone.weight+ " also its new color is "+iphone.color+".");
	System.out.println("is samsung S22 Ultra touchscreen? "+samsung.touchscreen+ " its new color is "+samsung.color+".");
	System.out.println("latest phone model from google is "+pixel.model+ "its weight is only "+pixel.weight+".");
	
	
		
		
	}
	
}
