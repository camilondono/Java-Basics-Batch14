package com.reps.java;

import java.util.Scanner;
class Main {
      public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your gender: M or F");

        String F = "F";
        String M = "M";
        String gender = scan.nextLine();


        System.out.println("Please enter your age");

        int age = scan.nextInt();

        if(gender.equals("F") && age>=25 ){
          System.out.println("Woman");
            }else if(gender.equals("M") && age>=25){
              System.out.println("Man");
        }
        if(gender.equals("F") && age<25){
          System.out.println("Girl");

          }  else if(gender.equals("M") && age<25){
              System.out.println("Boy");
        }


        }
}