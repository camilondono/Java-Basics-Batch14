package com.syntax.class09;

public class arrayDemo2FixedSize {

	public static void main(String[] args) {
		
		

        int[]nums= new int[2];
        nums[1]=12;
        nums[2]=13;
        // by default 0 become 0
        System.out.println( nums[0]);

        String[] colors=new String[3];
        colors[0]=" White";
        colors[1]=" pink";
        colors[2]=" Black";
        colors[3]=" Yellow";//.ArrayIndexOutOfBoundsException:3
        System.out.println( colors[2]);
		}

	}


