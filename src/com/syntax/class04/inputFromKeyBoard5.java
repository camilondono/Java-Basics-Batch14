package com.syntax.class04;

import java.util.Scanner;

public class inputFromKeyBoard5 {

	public static void main(String[] args)	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Did you solve replit assignments please enter true or false");
		boolean solvedAnyReplits=scanner.nextBoolean();
		
		if(solvedAnyReplits) {
		System.out.println("how many Replits have you solved");
		int noOfReplitsSolved=scanner.nextInt();
		
		if(noOfReplitsSolved>=17)
		{
			System.out.println("You are doing great");
		}else if (noOfReplitsSolved>10)
		{
			System.out.println("you are doing OK Please complete them as soon as possible");
		}else {
			System.out.println("you should solve some more Replits");
		}
		}
		else {
		System.out.println("They are very important to learn java please solve them");
	}
	}
}
