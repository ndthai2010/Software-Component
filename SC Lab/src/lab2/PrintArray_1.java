package src.lab2;

import java.util.Scanner;

public class PrintArray_1 {

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

	public static int[] inputArray(int[] items) {
		for (int index = 0; index < items.length; index++) {
			items[index] = sc.nextInt();
		}
		return items;
	}

	public static void printArray(int[] items) {
		for (int index = 0; index < items.length; index++) {
			if (index == 0) {
				System.out.print("[" + items[index]);
			} else {
				System.out.print("," + items[index]);
			}
		}
		System.out.print("]");
	}
}
