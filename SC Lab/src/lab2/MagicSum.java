package src.lab2;

import java.util.Scanner;

public class MagicSum {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int sentinel = -1;
		int magicSum = 0;
		System.out.print("Enter a positive integer (or −1 to end): ");
		int number = sc.nextInt();

		while (number != sentinel) { // Neu so nhap vao khac -1 thi chay vong lap
			if (hasEight(number)) {
				magicSum += number;
			}
			System.out.print("Enter a positive integer (or −1 to end): ");
			number = sc.nextInt();
		}
		System.out.print("The magic sum is : " + magicSum);
	}

	public static boolean hasEight(int number) {
		while (number > 0) {
			int check_digit_eight = number % 10; // lay so do cha 10 lay phan du
			if (check_digit_eight == 8) { // neu phan du = 8 tra ve true
				return true;
			}
			number = number / 10;
		}
		return false;
	}
}
