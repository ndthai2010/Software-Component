package src;
import java.util.Scanner;

public class NumberConversion {
	static String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number and radix: ");
		String inStr = sc.nextLine();
		System.out.print("Enter the input radix: ");
		int inRadix = sc.nextInt();
		System.out.print("Enter the output radix: ");
		int outRadix = sc.nextInt();
		sc.close();

		System.out.print("'" + inStr + "' in radix " + inRadix + " is '" + toRadix(inStr, inRadix, outRadix)
				+ "' in radix " + outRadix);

	}

	public static String toRadix(String inStr, int inRadix, int outRadix) {
		String result = "";
		if (inRadix == outRadix) {
			return inStr;
		}
		int decimal = Integer.parseInt(inStr, inRadix);
		if (outRadix == 0) {
			return result;
		}
		while (decimal > 0) {
			int charIdx = decimal % outRadix;
			result = ALPHABET.charAt(charIdx) + result;
			decimal = decimal / outRadix;
		}
		return result;
	}
}
