package com.syntax.class08;

public class SumEvenNumberto50 {

	public static void main(String[] args) {
	int sum =0;
	for(int a=1; a<=50; a++) {
		
		if(a%2==0) {
			sum=sum+a;
		}
	}
	System.out.println("The sum of even #'s between 1-50 is "+sum);
	

	}
}


