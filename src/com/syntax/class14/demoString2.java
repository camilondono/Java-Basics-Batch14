package com.syntax.class14;

public class demoString2 {

	public static void main(String[] args) {
	String firstName="Olena";
	String lastName="Dudka";
	System.out.println(firstName+" "+lastName); //mostly used
	System.out.println(firstName.concat(" ").concat(lastName));
	
	String str=" "; // true if no space and false if there is a space
	// isEmpty() returns true if a string is empty
	// this method will return false even if you have a space in a string variable howver the 
	// the methos isBlank does not count the spaces
	System.out.println(str.isEmpty());
	//System.out.println(str.isBlank()); error because this java version is old
	
	}

}
