package com.syntax.class09;

public class namesArray {

	public static void main(String[] args) {
		//Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
			
		String[]name=new String[4];
		
		name[0]="Celeste";
		name[1]="Viviana";
		name[2]="lucas";
		name[3]="Camilo";
		System.out.println(name[0]);
		
		System.out.println("----------");
		
		String[] names= {"Celeste","Viviana","Lucas","Camilo"};
		System.out.println(names[0]);
	
	}

}
