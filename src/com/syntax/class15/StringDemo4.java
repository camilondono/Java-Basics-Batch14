package com.syntax.class15;

public class StringDemo4 {
	public static void main(String[] args) {
		String str="sjbhd11223344556!@#$%^&*}{+_)(677889900bs0000hfrd6563248nkdjjd864hfh273899999";
		System.out.println(str.replaceAll("[0,5]","@"));
		System.out.println(str.replaceAll("[0,5]",""));
		System.out.println(str.replaceAll("[A-z]",""));// see ascii table for reference
		System.out.println(str.replaceAll("[0-z]",""));//everything removed except for certain characters
		
		
		
		
		
		
	}
}
