package com.syntax.class08;

import java.util.Scanner;

public class Hw6Coffee {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	double price= 5.29;
	double cafe = 0;
	
	do {
		System.out.println("please pay for your coffee");
		cafe=scan.nextDouble();
		
		if(cafe>=price) {
			System.out.println("Please pay less money");
		}
		else if	(cafe>price) {
		System.out.println("Please pay more money");
		}
	
	}while(price!=cafe);
		System.out.println("Enjoy you Coffee");
		
	}
}	
	