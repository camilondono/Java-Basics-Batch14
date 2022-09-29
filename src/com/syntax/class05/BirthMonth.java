package com.syntax.class05;

import java.util.Scanner;

public class BirthMonth {

	public static void main(String[] args) {
		// HW #2 BirthMonth
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		int month=scan.nextInt();
		if (month==3 || month==4 || month==5 ) {
			System.out.println("spring");
		}else if (month==6 || month==7 || month==8)
		{ System.out.println("Summer");
		}else if (month==9 || month==10 || month==11) {
			System.out.println("Fall");
		}else if (month==12 || month==1 || month==2) {
			System.out.println("Winter");
		}
		else {System.out.println("invalid");	
		}
	}
}
