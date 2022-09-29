package com.syntax.class14;

public class task1 {

	public static void main(String[] args) {
		String userName="user1";
        String password="pass123";
        String confirmPassword="pass123";
        if(userName.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        }else if(password.length()<8) {
            System.out.println("Password is too short");
        }else if(password.contains(userName)) {
        	System.out.println("Password can not contain user name");
        }else if(!password.equals(confirmPassword)) {
        	System.out.println("Password does not match");
        }else {
        	System.out.println("Your username name and password has been created");
        }
	
	}
}