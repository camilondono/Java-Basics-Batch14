package com.syntax.class06;

import java.util.Scanner;

public class AverageGrade {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your Grade?");
	char grade=input.next().charAt(0);
	
	String data;
	switch (grade) {
	case 'A':
		data= "Grade -> A Great job, Keep it up.";
		break;
	case 'B':
		data= "Grade -> B Good Job.";
		break;
	case 'C':
		data= "Grade -> C not to bad, you must study more.";
		break;
	case 'D':
		data= "Grade -> D Poor performance, You must study harder.";
		break;
	case 'F':
		data= "Grade -> F You are Failing, Please come to review classes every day.";
		break;
		default:
			data= "unavailable, please wait patiently for an update.";
			}
	System.out.println("Your current grade is "+data);
}
}