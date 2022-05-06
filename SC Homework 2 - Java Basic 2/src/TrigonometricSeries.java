package src;
import java.util.Scanner;

public class TrigonometricSeries {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		double x;
		int numTerms;
		System.out.print("Enter the x: ");
		x = sc.nextDouble();
		System.out.print("Enter the numTerms : ");
		numTerms = sc.nextInt();
		sc.close();
		System.out.printf("Sin(x) = %.2f%n", sin(x, numTerms));
		System.out.printf("Cos(x) = %.2f%n", cos(x, numTerms));

	}

	public static double calculateTerm(double x, int num) {
		double term = 1D;
		for (int i = num; i > 0; i--) {
			term *= x / i;
		}
		return term;
	}

	public static double sin(double x, int numTerms) {
		double result = 0D;
		for (int i = 0; i < numTerms; i++) {
			if (i % 2 == 0) {
				result += calculateTerm(x, (2 * i + 1));
			} else {
				result -= calculateTerm(x, (2 * i + 1));
			}
		}
		return result;
	}

	public static double cos(double x, int numTerms) {
		double result = 0D;
		for (int i = 0; i < numTerms; i++) {
			if (i % 2 == 0) {
				result += calculateTerm(x, (2 * i));
			} else {
				result -= calculateTerm(x, (2 * i));
			}
		}
		return result;
	}
}
