package src;
import java.util.Scanner;

public class FibonacciRecursive {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n: ");
		int n = sc.nextInt();
		sc.close();
		System.out.print("Then int Fibonacci of n: " + fibonacci(n));

	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
