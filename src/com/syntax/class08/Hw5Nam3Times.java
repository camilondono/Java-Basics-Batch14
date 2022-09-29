package com.syntax.class08;

import java.util.Scanner;

public class Hw5Nam3Times {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		String name;
		
		for(int a=1; a<=3; a++) {
			System.out.println("Please enter your name");
			
			name=input.nextLine();
			
			System.out.println("Good Afternoon "+ name);
		}
	}

}
