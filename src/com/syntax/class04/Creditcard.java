package com.syntax.class04;

import java.util.Scanner;

public class Creditcard {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you own a credit card");
		
	Boolean creditcard=scanner.nextBoolean();
	if (creditcard=true)
	{System.out.println("What is the current balance on your card");
		}
	else {System.out.println("would you like to apply for a credit card");
	}
	double balance=scanner.nextDouble();
	if (balance>1000)
	{
	 System.out.println("you can spend more");
		} 
	
	else
	{System.out.println("you must pay off immediatelly");
	}
	}
}