package com.syntax.class04;

import java.util.Scanner;

public class scannnnersample {

	public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("Pelease Enter your age");
        int age=scanner.nextInt();

        System.out.println("Pelease Enter your name");
        String name=scanner.nextLine();


        System.out.println(name+" is "+age+" years old");


    }

	}


