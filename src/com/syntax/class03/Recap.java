package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		String firstname="Camilo";
		String lastname="londono";
		String fullname=firstname+" "+lastname;
		System.out.println(fullname);
		
	// string concatenation helps us combine a string w/ primitive data type 
		
		int houseNo=10;
		int apartmentNo=5;
		String streetname="that street";
		String city="new York";
		String country="USA";
		String fullAdress=apartmentNo+" "+houseNo+" "+streetname+" "+city+" "+country;
		System.out.println(fullAdress);
       
		// String step1=("if we subtract 10 from 5 we get =" +10-5); no bueno
	    String step1=("if we subtract 10 from 5 we get =" +(10-5));
		System.out.println("if we subtract 10 from 5 we get =" +(10-5));
		
		
	}

}
