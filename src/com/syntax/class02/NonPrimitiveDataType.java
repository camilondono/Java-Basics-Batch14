package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		
		//string is just 1 of non primitive data types
		
		String name="Asma";
		String address="123 adress street";
		String phone= "123 4567 89";
		
		int age=17;
		//age should always be as an integer
		
		String character="A";
		
		//ctrl+space -> auto completes the statement
		//syso+ctrl +space
		
		System.out.println(name);
		//"my name is " +Asma
		
		System.out.println("My name is "+name);
		// there is a space after is 
		
		//asma is 17
		System.out.println(name + " is "+age);
		//spaces must be added inside double quotes 
		
		String fruit="apple";
		double price=1.99;
				//the price of the apple is 1,99
		System.out.println("the price of the"+fruit+ " is " +price);
		 
		fruit="mango";
		price=5.99;
		//the price of the mando is 5.99
		System.out.println("the price of the "+fruit+ " is " +price);
		
		// to attach any value( int, double, boolean,char, to a String we use + sign
		//+ next to the String acts as concatenation
		
		
		
		
	}

}
