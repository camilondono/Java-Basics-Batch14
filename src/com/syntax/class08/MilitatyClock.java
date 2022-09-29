package com.syntax.class08;

public class MilitatyClock {

	public static void main(String[] args) {
		 System.out.println("Military Clock");

		 for(double hour=1; hour<=24; hour++) {
			 
			 for(double minute=0;minute<=59; minute++) {
				 
				 System.out.println(hour+":"+minute);
			 }
		System.out.println("----------------");
		 }
	}

}
//for (int r=1; r<=23; r++) {
//for (int t=1; t<=59; t++) {
//System.out.println(String.format("%02d", r)+ " : " + String.format("%02d", t));
