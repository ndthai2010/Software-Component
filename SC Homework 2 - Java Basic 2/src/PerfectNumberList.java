package src;
import java.util.Scanner;

public class PerfectNumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Upper Bound: ");
		int upperBound = sc.nextInt();
		int countPer = 0;
		int countDefi = 0;
		for (int i = 1; i <= upperBound; i++) {
			if (isPerfect(i)) {
				System.out.print(i + " ");
				countPer++;
			}
		}
		System.out.println();
		for (int i = 1; i <= upperBound; i++) {
			if (isDeficient(i)) {
				System.out.print(i + " ");
				countDefi++;
			}
		}
		sc.close();
		System.out.println();
		System.out.println("[ " + countPer + " perfect numbers found ("
				+ Math.round((((double) countPer / upperBound) * 100) * 100.0) / 100.0 + "%)]");
		System.out.println("[ " + countDefi + " numbers found ("
				+ Math.round((((double) countDefi / upperBound) * 100) * 100.0) / 100.0 + "%)]");

	}
	
	public static boolean isPerfect(int aPosInt) {
		int sum = 0;
		for (int i = 1; i < aPosInt; i++) {
			if (aPosInt % i == 0) {
				sum += i;
			}
		}
		if (sum == aPosInt) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isDeficient(int aPosInt) {
		int sum = 0;
		for (int i = 1; i < aPosInt; i++) {
			if (aPosInt % i == 0) {
				sum += i;
			}
		}
		if (sum < aPosInt) {
			return true;
		} else {
			return false;
		}
	}
}
