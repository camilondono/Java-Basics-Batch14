package com.syntax.class06;

public class switchdemo2 {

	public static void main(String[] args) {
		//limitations of switch case
		//Can not use && ||
		//can not use logical operator and relationals operators
		//can not work with boolean values, floats or double and long
		
		
		char choice='N';
		String answer;
		
		switch(choice) {
		
		 case 'Y':
		 answer="Yes";
		 break;
		 case'N':
			 answer="No";
			 break;
		 case'M':
			 answer="Maybe";
			 break;
			 default:
				 answer="unknown";
				 break;
				}
		
		System.out.println(answer);
		
	}

}
