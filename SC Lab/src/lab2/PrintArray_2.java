package src.lab2;

import java.util.Scanner;

public class PrintArray_2 {
	
	public static void print(int[] array) {
		for (int index = 0; index < array.length; index++) {
			if (index == 0) {
				System.out.print("[" + array[index]);
			} else if (index == array.length) {
				System.out.print(array[index]);
			} else {
				System.out.print("," + array[index]);
			}
		}
		System.out.print("]");
	}

	public static void print(double[] array) {
		for (int index = 0; index < array.length; index++) {
			if (index == 0) {
				System.out.print("[" + array[index]);
			} else if (index == array.length) {
				System.out.print(array[index]);
			} else {
				System.out.print("," + array[index]);
			}
		}
		System.out.print("]");
	}

	public static void print(Float[] array) {
		for (int index = 0; index < array.length; index++) {
			if (index == 0) {
				System.out.print("[" + array[index]);
			} else if (index == array.length - 1) {
				System.out.print(array[index]);
			} else {
				System.out.print("," + array[index]);
			}
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		print(array);
	}

}
