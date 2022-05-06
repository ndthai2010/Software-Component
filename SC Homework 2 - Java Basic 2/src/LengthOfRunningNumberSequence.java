package src;
import java.util.Scanner;

public class LengthOfRunningNumberSequence {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n: ");
		int n = sc.nextInt();
		sc.close();
		System.out.print("Then S(" + n + ") = " + len(n));

	}

	public static String len(int n) {
		if (n == 1) {
			return "1";
		}
		return len(n - 1) + Integer.toString(n);
	}
}
