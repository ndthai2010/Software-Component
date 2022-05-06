package src.lab2;

import java.util.Scanner;

public class CopyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		System.out.print("Enter the values: ");

		int[] array = new int[size];
		for (int index = 0; index < size; index++) {
			array[index] = sc.nextInt();
		}

		System.out.print("Copy of the array: ");
		printArray(copyOfArray(array));
	}
	
	public static int[] copyOfArray(int[] array) {
		int[] copyArray = new int[array.length];
		for (int index = 0; index < array.length; index++) {
			copyArray[index] = array[index];
		}
		return copyArray;
	}
	
	public static void printArray(int[] array) {
		for (int index = 0; index < array.length; index++) {
			System.out.print(index + " ");
		}
	}
}
