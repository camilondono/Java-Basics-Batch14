package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo5 {

	public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("how many dresses would you like to buy");
	 int numberofdresses=scanner.nextInt();
	 
	 double[]prices=new double[numberofdresses];
	 
	 for(int i=0; i<numberofdresses; i++) {
		 System.out.println("Please enter the price of the dress "+(i+1));
		 prices[i]=scanner.nextDouble();
	 }
	 System.out.println(Arrays.toString(prices));
	 
	}

}
