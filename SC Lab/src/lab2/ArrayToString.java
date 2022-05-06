package src.lab2;

import java.util.Scanner;

public class ArrayToString {
	
	public static String arrayToString(int[] array) {
		String reString = "";
		if (array.length > 0) {
			for (int index = 0; index < array.length; index++) {
				if (index == 0) {
					reString = "[" + array[index] + reString;
				} else if (index == array.length - 1) {
					reString = reString + "," + array[index] + "]";
				} else {
					reString = reString + "," + array[index];
				}
			}
			return reString;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int index = 0; index < size; index++) {
			array[index] = sc.nextInt();
		}
		System.out.println(arrayToString(array));
	}
}
