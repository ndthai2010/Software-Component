package src;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of arrays: ");
		int numArray = sc.nextInt();
		System.out.print("Enter the key: ");
		int key = sc.nextInt();
		int[] array = new int[numArray];
		System.out.print("Enter the value of array : ");
		if (array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Have key : " + linearSearch(array, key));
		System.out.println("The index of array is key : " + linearSearchIndex(array, key));

	}

	public static boolean linearSearch(int[] array, int key) {
		for (int index = 0; index < array.length; index++) {
			if (array[index] == key) {
				return true;
			}
		}
		return false;
	}

	public static int linearSearchIndex(int[] array, int key) {
		for (int index = 0; index < array.length; index++) {
			if (array[index] == key) {
				return index;
			}
		}
		return 0;
	}
}
