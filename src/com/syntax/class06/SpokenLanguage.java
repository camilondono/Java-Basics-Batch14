package com.syntax.class06;

import java.util.Scanner;

public class SpokenLanguage {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 
	 System.out.println("Please enter the country you are from?");
	  String country=scan.nextLine();
	  String language;

	  switch (country) {
	  case "USA":
		  language="English";
		  break;
	  case "Colombia":
	  language="Spanish";
	  break;
	  case "Haiti":
		  language="Creole";
		  break;
	  case "Italy":
		  language="Italian";
		  break;
		  default:
			  language="unknown";
			  break;
		  }
	  
	  System.out.println("you are from "+country+" and your native language is "+language+".");
	}

}
