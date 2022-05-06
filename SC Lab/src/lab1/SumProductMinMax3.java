package src.lab1;

import java.util.Scanner;

public class SumProductMinMax3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2, number3;
		int sum, product, min, max;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Integer: ");
		number1 = sc.nextInt();
		System.out.print("Enter 2nd Integer: ");
		number2 = sc.nextInt();
		System.out.print("Enter 3rd Integer: ");
		number3 = sc.nextInt();
		
		sc.close();
		
		sum = number1 + number2 + number3;
		product = number1 * number2 * number3;
		max = Math.max(Math.max(number1, number3), number2);
		min = Math.min(Math.min(number1, number3), number2);
		
		System.out.println("The sum is " + sum);
		System.out.println("The product is " + product);
		System.out.println("The min is " + min);
		System.out.println("The max is " + max);
	}

}
