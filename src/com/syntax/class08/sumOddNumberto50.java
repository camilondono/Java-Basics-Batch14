package com.syntax.class08;

public class sumOddNumberto50 {

	public static void main(String[] args) {
		int sum=0;
		for(int c=1; c<=50; c++) {
			if(c%2!=0) {
				sum=sum+c;
			}
		
		}			
			System.out.println("The sum of Odd #'s to 50 is "+ sum);

}
}