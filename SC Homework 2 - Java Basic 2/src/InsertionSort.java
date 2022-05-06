package src;
import java.util.Scanner;

public class InsertionSort {

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

		insertSort(array);
		printArray(array);

	}

	public static void insertSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int insertNum = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > insertNum) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = insertNum;
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
