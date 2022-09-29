package com.syntax.class04;

public class Nestedifconditions {

	public static void main(String[] args) {
		
		int time=5;
		String day="Monday";
		//its called outter condition if its true than only inner condition will be checked
		//if its false nothing from inner if condition will be executed its like a main door
		// if main door is closed we cant enter the building.
		
		//outter if-condition
		if(day.equals("Monday")) {
			//as String is a noon primitive we cant use==sign we have to use equals method
			
			//inner if-condition
			if(time>7) {
				System.out.println("lets go to office");//inner
				}
			if(time<6) {
				System.out.println("lets sleep more");
			}
		}
		

	}

}
