package src;
import java.util.Scanner;

public class BubbleSort {

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

		bubbleSort(array);
		printArray(array);

	}

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void printArray(int[] array) {
		System.out.print("The values of sorted array are: [ ");
		for (int index = 0; index <= array.length - 2; index++) {
			System.out.print(array[index] + ", ");
		}
		System.out.print(array[array.length - 1] + " ]");
	}
}
