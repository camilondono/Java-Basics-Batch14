package com.syntax.class04;

public class Reviewclass2 {

	public static void main(String[] args) {
		
	short largerbox=129;
	byte smallerbox=(byte) largerbox;
		//explicit/narrowing/manual
		//as we cant fot 129 in byte we will get wrong results
System.out.println(smallerbox);

int largerbox1=129;
short smallerbox2=(byte) largerbox;
	// explicit/narrowing/manual
	//as we can fit 129 in short we will get proper results
System.out.println(smallerbox2);

//implicit/widening/automatic

short smallerbox3=45;
long largerbox3=smallerbox3;


		

	}

}
