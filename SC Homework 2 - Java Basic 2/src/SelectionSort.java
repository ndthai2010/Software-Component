package src;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array: ");
		int numArray = sc.nextInt();
		int[] array = new int[numArray];
		System.out.print("Enter the values of array: ");
		if (array.length > 0) {
			for (int index = 0; index < array.length; index++) {
				array[index] = sc.nextInt();
			}
		}
		sc.close();

		selectionSort(array);
		printArray(array);

	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIdx = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIdx]) {
					minIdx = j;
				}
			}
			int term = array[minIdx];
			array[minIdx] = array[i];
			array[i] = term;
		}
	}

	public static void printArray(int[] array) {
		System.out.print("The values of sorted array are : [ ");
		for (int index = 0; index <= array.length - 2; index++) {
			System.out.print(array[index] + ", ");
		}
		System.out.print(array[array.length - 1] + " ]");
	}
}
