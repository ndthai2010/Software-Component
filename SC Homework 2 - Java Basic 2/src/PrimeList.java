package src;
import java.util.Scanner;

public class PrimeList {
	public static boolean isPrime(int aPosInt) {
		if (aPosInt < 2) {
			return false;
		}
		for (int i = 2; i * i <= aPosInt; i++) {
			if (aPosInt % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Upper Bound: ");
		int upperBound = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= upperBound; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("[ " + count + " prime numbers found ]"
				+ Math.round((((double) count / upperBound) * 100) * 100.0) / 100.0 + "%)]");

	}
}
