package src.lab1;

import java.util.Scanner;

public class ReverseInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int inNumber = sc.nextInt();
		int inDigit = 0;
		sc.close();
		
		while(inNumber > 0) {
			inDigit += inNumber % 10;
			inDigit *= 10;
			inNumber = inNumber / 10;
		}
		
		inDigit = inDigit / 10;
		System.out.println("The reverse is:" + inDigit);
	}
}
