package com.syntax.class04;

public class nestedreview {

	public static void main(String[] args) {
		// nested if conditions are conditions which are dependent on each other
		// if outter condition is not true innner condition is never checked inner-contion is only chekced 
	//when outttr conditions is passed
	
        int money=12;

        if(money>10) {  //outer conditions

            System.out.println("Lets buy some eggs");
            int noOfEggs=2;

            if(noOfEggs>0) {
                System.out.println("lets boil the eggs");
            }

        }
}}