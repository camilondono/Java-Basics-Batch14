package reviewclass8;

import java.util.Scanner;

public class forLoopDemo4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int i=scanner.nextInt();
		
		while(i!=10) {
			System.out.println(i);
			i=scanner.nextInt();
		}
		
	}

}
