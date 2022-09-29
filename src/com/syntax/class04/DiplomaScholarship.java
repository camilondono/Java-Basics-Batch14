package com.syntax.class04;

import java.util.Scanner;

public class DiplomaScholarship {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Do you have a diploma? please enter true for yes otherwise enter false");
		boolean diploma=scanner.nextBoolean();
		if(diploma) {
			System.out.println("Congratulations");
			System.out.println("what is your GPA score");
			
			double gpa=scanner.nextDouble();
			if (gpa>=3.5) {
				System.out.println("You are elegible for a scholarship");
			}
			else {System.out.println("you should have stidied harder");
		}
	}
	}
}
