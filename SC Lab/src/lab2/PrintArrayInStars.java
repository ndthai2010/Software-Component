package src.lab2;

import java.util.Scanner;

public class PrintArrayInStars {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		final int numItems;
		int[] items;
		System.out.print("Enter the number of items: ");
		numItems = sc.nextInt();
		System.out.println("Enter the values of all items (seperated by space): ");
		items = new int[numItems];
		inputArray(items);
		printArray(items);

	}

	public static void inputArray(int[] items) {
		if(items == null) {
			return;
		}
		for (int index = 0; index < items.length; index++) {
			items[index] = sc.nextInt();
		}
	}

	public static void printArray(int[] items) {
		if(items == null) {
			return;
		}
		for (int index = 0; index < items.length; index++) {
			System.out.print(items[index] + ": ");
			for (int i = 1; i <= items[index]; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
