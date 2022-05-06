package src.lab2;

import java.util.Scanner;

public class SearchArray {

	public static int search(int[] array, int key) {
		for (int index = 0; index < array.length; index++) {
			if (key == array[index]) {
				return index;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key: ");
		int key = sc.nextInt();
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("Index search value: " + search(array, key));
	}

}
