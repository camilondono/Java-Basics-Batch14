package com.syntax.class09;

public class clock3 {

	public static void main(String[] args) {
		   for (int h = 0; h < 24; h++) { //controls hours

	            for (int m1 = 0; m1 <= 5; m1++) {  //cntrols first digit of mins

	                for (int m2 = 0; m2 <= 9; m2++) { // controls second digit of mins

	                    if (h < 10) {
	                        System.out.println("0" + h + ":" + m1 + m2);
	                    } else {
	                        System.out.println(h + ":" + m1 + m2);
	                    }
	                }
	            }
	        }
	    }
    }
