package com.syntax.class05;

import java.util.Scanner;

public class CurrentTime {

	public static void main(String[] args) {
		// HW #1 Current Time
Scanner scan=new Scanner(System.in);
System.out.println("Please enter the current time use 24h format");
int hour=scan.nextInt();
if (hour>=1 && hour<=11) {
	System.out.println("Morning");
}else if (hour>=12 && hour<=15) {
	System.out.println("Afternoon");
}else if (hour>=16 && hour<=20) {
	System.out.println("Evening");
}else if (hour>=21 && hour<=24) {
	System.out.println("night");
}
	}

}
