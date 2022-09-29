package com.syntax.class15;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    public void printAllIndexes(String str,char c) {
	        for(int i=0;i<str.length();i++) {

	            if(str.charAt(i)==c) {
	                System.out.println(i);
	            }
	        }
	    }
	}

}
