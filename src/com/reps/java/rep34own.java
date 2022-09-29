package com.reps.java;

import java.util.Scanner;

public class rep34own {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		  System.out.println("Please enter 3 distinct numbers");
		int number=scanner.nextInt();
		int number2=scanner.nextInt();
		int number3=scanner.nextInt();

		  if (number> number2 && number >number3){
		    System.out.println("The largest number is "+number);
		  }
		  else if (number2>number && number2>number3)
		  {
		    System.out.println("The largest number is "+number2);
		  }
		  else {
		    if (number3>number && number3>number2)
		    {
		      System.out.println("The largest number is "+number3);
		    }
		      }	

	}

}
