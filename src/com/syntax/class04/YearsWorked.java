package com.syntax.class04;

import java.util.Scanner;

public class YearsWorked {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number of years worked");
		int years=scanner.nextInt();
		if(years>5)
		{
			System.out.println("You are elegible for the bonus");
			}System.out.println("Please enter your annual salary");
			int salary=scanner.nextInt();
			if(salary>50000) {
				System.out.println("your bonus will be 5000");
				}else
				{
					System.out.println("Your bonus will be 3000");
				}
		
		

	}

}
