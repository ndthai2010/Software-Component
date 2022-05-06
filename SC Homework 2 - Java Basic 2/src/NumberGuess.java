package src;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {

		final int SECRET_NUMBER = (int) (Math.random() * 100);
		Scanner sc = new Scanner(System.in);
		System.out.println("Key in your guess : ");
		int guess = sc.nextInt();
		int trials = 0;
		while (true) {
			trials++;
			if (guess == SECRET_NUMBER) {
				System.out.println("You got it in " + trials + " trials !");
				break;
			} else if (guess < SECRET_NUMBER) {
				System.out.println("Try higher");
				guess = sc.nextInt();
			} else {
				System.out.println("Try lower");
				guess = sc.nextInt();
			}
		}
		sc.close();
	}
}
