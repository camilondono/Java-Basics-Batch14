package com.syntax.class02;

public class variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte box1=16;
		short box2=160;
		int box3=16000;
		long box4=2000000;
		
		float variable=199f;
		double variable2=99.99;
		
		char container='c';
		char dollar='$';
		
		boolean tired=false;
		boolean active=true;
		
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(variable);
		System.out.println(variable2);
		System.out.println(container);
		System.out.println(dollar);
		System.out.println(tired);
		System.out.println(active);
	
		box2=260;
		System.out.println(box2);
		//value of box 2 was reasign 
		
		//rules for identifiers=names (variables,methods
		// 1. cannot use rules as identifiers
		// String new="hello"; -> error
		
		// 2 cannot have space in identifiers
		//String 1last name+ "smith";
		
		//3 identifiers cannot start with numbers
		
		int number=123; // number can be anywhere after identifier
						// number1=123;
		//4 identifiers cannot cpntain special characters 
		//except $ or _;
		boolean hello=true;
		
		double $price=9.98;
		float _price1=1.99F;
	
	
	
	}

}
