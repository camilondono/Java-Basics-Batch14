package com.syntax.class10;

public class hw4 {

	public static void main(String[] args) {
															//enhanced for loop.
		int[] num = { 100, 230, 84, 556, 678, 23, 911 };

        int largest = num[0];

        for (int number : num) {
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println(largest);
    }
}

	


