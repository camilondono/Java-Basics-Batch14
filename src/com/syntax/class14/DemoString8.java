package com.syntax.class14;

public class DemoString8 {

	public static void main(String[] args) {
		
		String str="Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
        //replace me
		
		
		System.out.println(str.replace("good", "Excellent"));
        System.out.println(str.replaceAll("[a-z]", " "));//we specify  word we want to replace

	}

}
