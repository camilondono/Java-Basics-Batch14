package com.syntax.class02;

public class Varaibles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Camilo";
		String last="Londono";
		String grade="A";
		String state="Florida";
		String city="West Palm Beach";
		String phone="862 297 7916";
		
		System.out.println("my name is " + name + " and my last name is " +last);
		System.out.println("I am a grade " +grade +" student");
		System.out.println("I live in " +city +" " +state);
		System.out.println("and my phone number is " +phone);
		
		
		city="Miami";
		state="USA";
		grade="B";
		phone="1234875699";
		
		System.out.println();
		System.out.println("My name is "+ name + " and my last name is " + last);
		System.out.println("I am a grade " + grade + " student");
		System.out.println("I moved to " + city + ", " + state);
		System.out.println("and my new phone number is " + phone);
		

	}

}