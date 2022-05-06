package src.lab2;

import java.util.Scanner;

public class EqualsArray {

	public static boolean equals(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		} else {
			for (int index = 0; index < array1.length; index++) {
				if (array1[index] != array2[index]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		int[] array1 = new int[size1];
		int[] array2 = new int[size2];

		System.out.print("Enter the values of array 1: ");
		for (int index = 0; index < size1; index++) {
			array1[index] = sc.nextInt();
		}
		System.out.print("Enter the values of array 2: ");
		for (int index = 0; index < size2; index++) {
			array2[index] = sc.nextInt();
		}
		System.out.print("Results: " + equals(array1, array2));
	}
}
