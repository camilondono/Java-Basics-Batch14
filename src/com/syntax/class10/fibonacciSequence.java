package com.syntax.class10;

import java.util.Arrays; // imported Arrays 

public class fibonacciSequence {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		// for this task we will be using the for loop.
		
		int c=10;
		int fibonacci[]=new int[c];
		fibonacci[0]=0;
		fibonacci[1]=1;
		for (int i=2; i<c; i++) {
		fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
		}
		System.out.println(Arrays.toString(fibonacci));
		//arrays must be imported in order to be able to run and print the program
	}

}
