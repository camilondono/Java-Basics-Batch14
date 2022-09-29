package com.syntax.class10;

public class hw1 {

	public static void main(String[] args) {
		
		String[] cars = new String[6];
        cars[0] = "Ford";
        cars[1] = "Ferrari";
        cars[2] = "Honda";
        cars[3] = "Toyota";
        cars[4] = "Kia";
        cars[5] = "Suzuki";
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("-------------");

        String[] car = { "Ford", "Ferrari", "Honda", "Toyota", "Kia", "Suzuki" };
        for (String carList : car) {
            System.out.print(carList+" ");
        }

	}

}
