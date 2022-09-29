package com.syntax.class15;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		String str="Today is Sunday";
		String day=str.substring(9);
		System.out.println(day);
		
		
		String strr="Today is Sunday";
		String dayy=str.substring(6,8);
		System.out.println(dayy);

		char c=str.charAt(4); //calling the method charAt on str object.
		System.out.println(str.charAt(4));// two ways to do it
		System.out.println(c);
		System.out.println("----------------");
		
		char[] charArr=str.toCharArray();
		System.out.println(Arrays.toString(charArr));
		//System.out.println(charArr);
		
		int index=str.indexOf("a");
		System.out.println(index);
		System.out.println(str.indexOf("a",6));// to ignore the 6 first letters
		
		
	}

}
