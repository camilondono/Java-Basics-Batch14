package com.syntax.class14;

public class demostring3 {

	public static void main(String[] args) {
		
		String str=" i love java ";
        System.out.println(str);
        /*
         * Remove the spaces before and after the
         * String but not the ones which are present in between
         */
        System.out.println(str.trim());
        
        //startsWith checks if a string starts specific letter or word
        //endsWith checks is string ends with specific letter or word
        //contains checks is String contains a specific letter or word 
        //these methods are all case sensitive
        
        
        String str2="Java is very easy";
        System.out.println(str2.startsWith("Java"));
        System.out.println(str2.endsWith("y"));
        System.out.println(str2.contains("very"));
        //System.out.println(str2.toLowerCase().contains("very")).. in case there is upper or lower case
        //Method chaining helps to call multiple methods on a single line one method after another.
	
	}

}
