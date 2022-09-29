package com.syntax.class08;

public class Number50exceptdivisibleBy3 {

	public static void main(String[] args) {
		for(int c=1; c<=50; c++) {
			if(c%3==0) {
				continue;
			}
			System.out.print(c+" ");
		}

	}

}
