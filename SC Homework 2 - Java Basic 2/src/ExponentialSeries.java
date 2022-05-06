package src;
import java.util.Scanner;

public class ExponentialSeries {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int numTerms;
		System.out.print("Enter the x : ");
		double x = sc.nextDouble();
		System.out.print("Enter the numTerms : ");
		numTerms = sc.nextInt();
		sc.close();
		System.out.printf("The special series of x : %.2f%n", specialSeries(x, numTerms));

	}

	public static double specialSeries(double x, int numTerms) {
		double sum = x;
		for (int i = 1; i < numTerms; i++) {
			double term = (double) Math.pow(x, 2 * i + 1) / (2 * i + 1);
			for (int j = 2 * i - 1; j > 0; j -= 2) {
				term *= (double) j / (j + 1);
			}
			sum += term;
		}
		return sum;
	}
}
