package com.syntax.class04;

import java.util.Scanner;

public class Citytemperature {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your city name?");
		String city=scanner.nextLine();
		System.out.println("what is the city temperature?");
		int temperature=scanner.nextInt();
		temperature=(temperature-32)*5/9;
		System.out.println("The temperature of the city in celsius is "+temperature);
		

		
		
			
		}
		
		

	

}
