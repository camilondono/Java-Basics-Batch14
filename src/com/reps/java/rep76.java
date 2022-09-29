package com.reps.java;

import java.util.Scanner;

public class rep76 {

	public static void main(String[] args) {
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

		Scanner input = new Scanner(System.in);
		System.out.println("Input number");
		int number = input.nextInt();

		if(number > 0 && number < 8){
		System.out.println(weekdays[number-1]);
		}else{
		System.out.println("Invalid number");
		}

	}

}
