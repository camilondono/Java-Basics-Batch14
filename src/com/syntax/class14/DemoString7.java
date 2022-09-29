package com.syntax.class14;

public class DemoString7 {

	public static void main(String[] args) {
		 String str="I am always consfused i was kidding";

	        System.out.println(str.indexOf("a"));
	        System.out.println(str.indexOf("s"));
	        System.out.println(str.indexOf(" "));
	        
	        System.out.println(str.substring(12));
	        //substring () gives you a smaller string from s string we can start the starting
	        //part to this method and it will return us the substring from that index
	        
	        System.out.println(str.substring(5,11));
	        //
	}

}
