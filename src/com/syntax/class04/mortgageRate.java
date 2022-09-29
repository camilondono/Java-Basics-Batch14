package com.syntax.class04;

import java.util.Scanner;

public class mortgageRate {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your mortgage rate");
		double mortgage=scanner.nextDouble();
		if (mortgage>4.7) {
			System.out.println("You will not buy a house");
		}else {
			System.out.println("You can buy a house");
		}
		System.out.println("what is your loan amount");
		double price=scanner.nextDouble();
		if (price>200000) {
			System.out.println("you need to take a loan");
		}else {
			System.out.println("you will pay the appraisal in cash");
		}

	}

}
