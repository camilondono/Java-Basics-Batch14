package com.syntax.class08;

import java.util.Scanner;

public class SecretNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int secret=1234;
		int guess;
		do {
			System.out.println("Please guess a secret number");
		guess =input.nextInt();
		}while(guess!=secret);
	System.out.println("you won");
	}

}
