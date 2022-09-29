package com.syntax.class06;

import java.util.Scanner;

public class calculatorSwithCase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first #");
		double num=scan.nextDouble();
		System.out.println("Enter your second #");
		double num2=scan.nextDouble();
		System.out.println("Enter your Operator");
		char operator=scan.next().charAt(0);
		
		double result = 0;
		switch (operator) {
		case '+':
			result=num+num2;
			break;
		case '-':
			result=num-num2;
			break;
		case '*':
			result=num*num2;
			break;
		case '/':
			result=num/num2;
			break;
		}
		System.out.println("the result is "+result);
	}

}
