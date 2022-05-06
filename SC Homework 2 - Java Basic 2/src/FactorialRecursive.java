package src;
import java.util.Scanner;

public class FactorialRecursive {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n: ");
		int n = sc.nextInt();
		sc.close();
		System.out.print("Then Int Factorial of n: " + factorial(n));

	}

	public static int factorial(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
