package com.reps.java;

import java.util.Scanner;

public class Rep34FromGooooogle {


		public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
			int x, y, z;
					
			System.out.println("Please Enter three Different Value: ");
			int number= scanner.nextInt();
			int number2= scanner.nextInt();
			int number3= scanner.nextInt();
			
			if (number > number2 && number > number3) {
				System.out.format("\n% d is the largest %d and %d", number, number2, number3);
			}
			else if (number2 > number && number2 > number3) {
				System.out.format("\n% d is the largest %d and %d", number2, number, number3);
			}	
			else if (number3 > number && number3 > number2) {
				System.out.format("\n% d is the largest %d and %d", number3, number, number2);
			}		
			else {
				System.out.println("\n Either any two values or all the three values are equal");
			}
		}
	}

	
