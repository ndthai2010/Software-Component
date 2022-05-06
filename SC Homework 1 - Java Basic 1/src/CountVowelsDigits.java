package src;
import java.util.Scanner;

public class CountVowelsDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String inStr = sc.next().toLowerCase();
		int inStrLen = inStr.length();
		int countNum = 0;
		int countVowels = 0;
		for (int index = 0; index <= inStrLen - 1; index++) {
			if (Character.isDigit(inStr.charAt(index))) {
				countNum++;
			} else {
				switch (inStr.charAt(index)) {
				case 'u':
				case 'e':
				case 'o':
				case 'a':
				case 'i':
					countVowels++;
				default:
					break;
				}
			}
		}
		System.out.printf("Number of vowels : %d (%.2f%%)\n", countVowels, (double) countVowels / inStrLen * 100);
		System.out.printf("Number of digits : %d (%.2f%%)\n", countNum, (double) countNum / inStrLen * 100);
	}
}
