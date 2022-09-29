package com.reps.java;

import java.util.Scanner;

public class rep78 {

	public static void main(String[] args) {
		   
			      
		        int i,sum=0; 
		        int arr[]=new int[5]; 
		         
		        System.out.println("Enter 5 numbers"); 
		         
		        Scanner sc=new Scanner(System.in); 
		         
		        for(i=0;i<10;++i) 
		             arr[i]=sc.nextInt(); 
		         
		        for(i=0;i<10;i=i+10) 
		            sum=sum+arr[i]+10; 
		         
		        System.out.println(arr[i]); 
		    } 
		 

	}

