package com.syntax.class04;

import java.util.Scanner;

public class DmvRepresentative {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("how old are you");
		double age=scanner.nextDouble();
		if (age>=18)
		{
			System.out.println("You are elegible to issue your drivers license");
		}
		else {
			System.out.println("you most issue a learner's permit.");
		}
		

	}

}
