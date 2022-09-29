package com.syntax.class10;

public class tenNumbersfibonacciSeries {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		// for this task we will be using the for loop.
		
		int f1=0;
		int f2=1;
		int fibonacci=0;
		
		System.out.print(f1+" "+f2);
			
			for(int c=2; c<10; c++) {
			 fibonacci=f1+f2;
			System.out.print(" "+fibonacci);
			 f1=f2;
			 f2=fibonacci;
				
			}

			}	
		
	}


