package com.syntax.class05;

public class recaifNestedcondition {

	public static void main(String[] args) {
	
	boolean allergy=true;
	String allergyType="Peanut";
	if (allergy) {
		System.out.println("lets check what allergy you have");   //if condition inside the other if condition
	if (allergyType.equals("pollen")) {
		System.out.println("try to stay indoor");
	}
	else if(allergyType.equals("Peanut"));{
	System.out.println("stay away from peanuts");}
	}
	else 
		System.out.println("You are lucky");
		
}
		
		
}
