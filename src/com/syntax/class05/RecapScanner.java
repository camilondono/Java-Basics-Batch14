package com.syntax.class05;
//control=shift+o
import java.util.Scanner;

public class RecapScanner {

	public static void main(String[] args) {
	
		
		String str="hello";
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		//to csapture different values we need to use diffrent optios
		//
		
		
		String name=input.next();
		//capturing a string
		//when capturing intiger use int age=input.nextInt();
		System.out.println("nice to meet you "+name);
		
		System.out.println("how old are yooou??");
		int age=input.nextInt();
		
		System.out.println(name+" is "+age+" years old");
		
		System.out.println("How much money do you have "+name);
		double money=input.nextDouble();
		System.out.println(name+" has $"+money);
		
		System.out.println(name+ "whats your grade");
		input.next().charAt(0);
		//
		
		
		System.out.println("End");

	}

}
