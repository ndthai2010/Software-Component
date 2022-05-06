package src.lab2;

import java.util.Scanner;

public class GradesStatisticsPlus {

	public static int[] grades;

	public static void readGrades() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int size = sc.nextInt();
		grades = new int[size];
		for (int index = 0; index < size; index++) {
			System.out.print("Enter the grade for student " + (index + 1) + ": ");
			grades[index] = sc.nextInt();
		}
	}

	public static void printArray(int[] array) {
		for (int index = 0; index < array.length; index++) {
			if (index == 0) {
				System.out.print("[" + array[index]);
			} else if (index == array.length - 1) {
				System.out.print("," + array[index] + "]");
			} else {
				System.out.print("," + array[index]);
			}
		}
		System.out.println("\n");
	}

	public static double computeAverageGrades(int[] students) {
		int sum = 0;
		double avg = 0.0;
		for (int index = 0; index < students.length; index++) {
			sum += students[index];
		}
		avg = (double) sum / students.length;
		return avg;

	}

	public static int findMaxGrades(int[] students) {
		int max = students[0];
		for (int index = 0; index < students.length; index++) {
			if (max < students[index])
				max = students[index];
		}
		return max;
	}

	public static int findMinGrades(int[] students) {
		int min = students[0];
		for (int index = 0; index < students.length; index++) {
			if (min > students[index])
				min = students[index];
		}
		return min;
	}

	public static double stdDev(int[] students) {
		double stdDevVal = 0;

		for (int index = 0; index < students.length; index++) {
			stdDevVal += ((double) 1 / students.length) * students[index] * students[index];
		}
		return Math.round(Math.sqrt(stdDevVal - Math.pow(computeAverageGrades(students), 2)) * 100.0) / 100.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readGrades();
		System.out.println("The grades are: ");
		printArray(grades);
		System.out.println("The average is: " + Math.round(computeAverageGrades(grades) * 100) / 100);
		System.out.println("The maximum is: " + findMaxGrades(grades));
		System.out.println("The minimum is: " + findMinGrades(grades));
		System.out.println("The standard deviation is: " + stdDev(grades));
	}

}
