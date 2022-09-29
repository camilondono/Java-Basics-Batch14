package com.syntax.class13;

public class Student {

	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study() {
		System.out.println(" Student is studying");
	}
	void deleteMessages() {
		System.out.println("Deleting Messages from Discord");
	}
	void eat() {
		System.out.println("Eating Pizza");
	}
	public static void main(String[] args) {
		//new Student()-> creates the object of a student class
		Student friadoonObject=new Student();
		friadoonObject.name="friadoon";
		friadoonObject.id="123";
		friadoonObject.age=22;
		System.out.println(friadoonObject.name);
		System.out.println(friadoonObject.age);
		friadoonObject.deleteMessages();
		System.out.println("------------------");
	Student student2=new Student();
	student2.name="Asma";
	student2.age=16;
	student2.weight=30;
	student2.gender='F';
	System.out.println(student2.name);
	student2.eat();
	
	
	
	
	}
}
