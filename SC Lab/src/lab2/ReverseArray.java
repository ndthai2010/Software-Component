package src.lab2;

import java.util.Scanner;

public class ReverseArray {

	public static void reverse(int[] array) {
		int length = array.length;
		for (int index = 0; 2 * index + 1 < length; index++) {
			int rev = array[index];
			array[index] = array[length - index - 1];
			array[length - index - 1] = rev;

		}
	}

	public static void printArray(int[] array) {
		for (int index : array) {
			System.out.println(index + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the value: ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Original array: ");
		printArray(array);

		System.out.println("Reverse array: ");
		reverse(array);
		printArray(array);
	}

}
