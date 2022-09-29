package com.syntax.class09;

public class arrayDemo1 {

	public static void main(String[] args) {
		
		int [] arr=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		//accesing elements from the array
		System.out.println(arr[2]);
		System.out.println(arr[1]+arr[2]);
		System.out.println("-----------------");
		// lets create an array and store your classmates
		
		String[]names=new String[5];
		names[0]="Shah";
		names[1]="vera";
		names[2]="Roman";
		names[3]="Guljan";
		names[4]="Zamanhullah";
		
		System.out.println("hello "+names[1]);
		
	}

}
