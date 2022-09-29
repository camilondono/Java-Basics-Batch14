package com.syntax.class11;

public class DemoOneClazzEleven {

	public static void main(String[] args) {
	
		String [] dresses=new String[] {"Pink Dress","cocktail","Summer Dress","Night Dress"
                ,"Pencil Dress"};
        //last index is always size-1 because arrays
        // index start from zero
        System.out.println(dresses.length);
        System.out.println("-----------------");
        for(int i=0;i<dresses.length;i++) {
            System.out.println("Lets try "+dresses[i]);
		
        	}
        }
	}

