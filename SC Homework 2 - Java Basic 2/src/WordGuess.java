package src;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {
	public static void main(String[] args) {

		final String[] WORDS_ARRAY = { "play", "dragon", "testing", "crazy", "diamond", "beach", "computer", "soup",
				"people", "missing", "dotor", "badminton", "soccer" };
		Random rand = new Random();
		String secretWord = WORDS_ARRAY[rand.nextInt(WORDS_ARRAY.length - 1)];

		Scanner sc = new Scanner(System.in);
		int trials = 0;
		String temp = "", hold = "";
		boolean check = false;
		do {
			trials++;
			System.out.println("key in one character or your guess word : ");
			String guess = sc.nextLine();
			if (temp.equals(secretWord) || guess.equals(secretWord)) {
				System.out.println("Congratulation!");
				break;
			}
			for (int i = 0; i < secretWord.length(); i++) {
				if (guess.equals(Character.toString(secretWord.charAt(i)))) {
					if (!check)
						temp += Character.toString(secretWord.charAt(i));
					else {
						hold = Character.toString(temp.charAt(i)).replace("-", guess);
						temp = temp.substring(0, i) + hold + temp.substring(i + 1, temp.length());
					}
				} else {
					if (!check) {
						temp += "-";
					}
				}
			}
			check = true;
			System.out.println(temp);
		} while (trials < 30);
		sc.close();
		System.out.println("You got it in " + trials + " trials !");
	}
}
