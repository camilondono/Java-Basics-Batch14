package com.syntax.class06;

import java.util.Scanner;
public class CalculatorElseIF {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first #");
		double num=scan.nextDouble();
		System.out.println("Enter your second #");
		double num2=scan.nextDouble();
		System.out.println("enter the operator");
		char operator=scan.next().charAt(0);
		
	if (operator== '+')	{
		System.out.println(num+num2);
	}else if (operator =='-') {
		System.out.println(num-num2);
	}else if (operator =='*') {
		System.out.println(num*num2);
	}else if (operator =='/') {
		System.out.println(num/num2);
	}
	}
}
