package src;
import java.util.Scanner;

public class GCDRecursive {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the a : ");
		int a = sc.nextInt();
		System.out.print("Enter the b : ");
		int b = sc.nextInt();
		sc.close();
		System.out.print("The GCD of a and b is : " + gcd(a, b));

	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return Math.abs(a);
		}
		if (a == 0) {
			return Math.abs(b);
		}
		return gcd(b, (a % b));
	}
}
