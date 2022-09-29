package com.syntax.class04;

import java.util.Scanner;

public class InputFromkeyBoard4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your name");
		// takes a string type input from the keyboard and stores in in name variable
		
		String name=scanner.nextLine();
		System.out.println("Please enter your age");
		//takes and int from the key board and stores it in a variable
		int age=scanner.nextInt();
		System.out.println("Hi "+name+" you are "+age+" years old ");
		
		 
		

	}

}
