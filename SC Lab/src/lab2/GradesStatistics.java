package src.lab2;

import java.util.Scanner;

public class GradesStatistics {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the numbers of students: ");
		int numbers = sc.nextInt();
		int[] students = new int[numbers];
		inputArray(students);
		System.out.println("The average is: " + computeAverageGrades(students));
		System.out.println("The maximum is: " + findMaxGrades(students));
		System.out.println("The minimum is: " + findMinGrades(students));
	}
	
	public static int[] inputArray(int[] students) {
		if(students == null) {
			return null;
		}
		for (int index = 0; index < students.length; index++) {
			System.out.print("Enter the grade for student " + (index + 1) + ": ");
			students[index] = sc.nextInt();
		}
		return students;
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
}
