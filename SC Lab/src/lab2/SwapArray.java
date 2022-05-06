package src.lab2;

import java.util.Scanner;

public class SwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of arrays: ");
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		int[] array1 = new int[size1];
		int[] array2 = new int[size2];

		System.out.println("Enter the values of array 1: ");
		for (int index = 0; index < size1; index++) {
			array1[index] = sc.nextInt();
		}
		System.out.println("Array 1 is: ");
		printArray(array1);

		System.out.println("Enter the values of array 2: ");
		for (int index = 0; index < size2; index++) {
			array2[index] = sc.nextInt();
		}
		System.out.println("Array 2 is: ");
		printArray(array2);

		System.out.println("Results after swapping arrays: ");
		if (swap(array1, array2)) {
			System.out.println("Array 1: ");
			printArray(array1);
			System.out.println("Array 2: ");
			printArray(array2);
		}
	}
	
	public static boolean swap(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		} else {
			for (int index = 0; index < array1.length; index++) {
				int temp = array1[index];
				array1[index] = array2[index];
				array2[index] = temp;
			}
		}
		return true;
	}

	public static void printArray(int[] array) {
		for (int index : array) {
			System.out.println(index + " ");
		}
	}
}
