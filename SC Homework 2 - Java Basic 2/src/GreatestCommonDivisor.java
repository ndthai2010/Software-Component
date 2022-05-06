package src;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static int gcd(int numA, int numB) {
		while (numB != 0) {
			int temp = numB;
			numB = numA % numB;
			numA = temp;
		}
		return numA;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberA = sc.nextInt();
		int numberB = sc.nextInt();
		System.out.println("gcd is " + gcd(numberA, numberB));
	}
}
