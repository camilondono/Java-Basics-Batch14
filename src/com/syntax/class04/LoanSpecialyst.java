package com.syntax.class04;

import java.util.Scanner;

public class LoanSpecialyst {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("what is the amount of a loan you desire");
		double loan=scanner.nextDouble();
		
	if (loan<=200000) {
		System.out.println("Your loan has been approved");
	}
	else {
		System.out.println("Your loan has been rejected");
	}
	}

}
