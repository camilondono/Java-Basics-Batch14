package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		 //type casting=> converting value from a data type to another data type.
		
		//int number=15.2; // we cant store decimals in a box of type int
		
		byte box1=127; // smallest box 8 bits
		short box2=3333;//double the size of box1 in terms of bits
		int box3=45454545; //large box most commonly used
		long box4=4545454; //slightly lasrge box
		float box5=41454647; // larger
		double box6=454545445; //largest
		
		//int number=15.2 //we cant store the decimal number in a box of type int "double or float"
		
		int number=(int)15.2;
		System.out.println(number);
				
		
	byte smallerbox=(byte)box2;/////casting
	System.out.println(smallerbox);
	
	short biggerbox=box1;
	long box7=box1;// we can do this because box7 is larger than box1
	float box8=(float)box6;// casting puting bigger values into smaller values
	                       // willl give you an answer even though some # will be discarded
	
	System.out.println(box6);
		

	}

}
