package com.syntax.class10;

public class lettersReverse {

	public static void main(String[] args) {
		
		char[] letters = {'F', 'E', 'D', 'C', 'B', 'A'};

        int arrSize = letters.length;

        for (int i = arrSize-1; i >= 0; i--){
            System.out.print(letters[i] + " ");
        }

    }

}


