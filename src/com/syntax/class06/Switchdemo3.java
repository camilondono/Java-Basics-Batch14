package com.syntax.class06;

import java.util.Scanner;

public class Switchdemo3 {

	public static void main(String[] args) {
		//ask a user where is he/she from
		//based on country define favorite food
		
		Scanner in=new Scanner(System.in);
		System.out.println("please tell me where you are from");

		String country=in.nextLine();
		String favoriteFood;
		
		switch(country) {
		case "USA":
			favoriteFood="Burguers and fries";
			break;
		case"Kazakhstan":
			favoriteFood="beshparmak";
			break;
		case"Turkey":
			favoriteFood="adana kebab";
			break;
		case "Venezuela":
			favoriteFood="Arepa";
			break;
		case"India":
			favoriteFood="chicken curry";
			break;
		case"Yemen":
			favoriteFood="Mandi";
			break;
		
	}
		System.out.println("You are from "+country+ " your favorite food is "+favoriteFood);
	
	
	
	
	
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	


