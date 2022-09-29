package com.syntax.class04;

import java.util.Scanner;

public class inputFromkeyboard {

	public static void main(String[] args) {
		//Scanner is a class that helps us take the input from keyboard
		//it contains many different smaller modules called methods that can help us
		//take strings boolean basically all types of data from the keyboard
		
		Scanner input= new Scanner(System.in);
		//a message will be display to user in console to enter his/her name
		
		System.out.println("Please enter yor name");
		//activates the java program to take the input from the keyboard and store it inside the name variable
		
		String name=input.next();
		//prints whatever name user enters on the keyboard on the console
		
		System.out.println("Hello "+name+" don't be confused ");
	}
        //after writting name in the console hit enter
}
