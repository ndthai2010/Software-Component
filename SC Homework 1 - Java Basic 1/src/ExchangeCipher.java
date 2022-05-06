package src;
import java.util.Scanner;

public class ExchangeCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inStr = sc.next().toUpperCase();
		for(int index = 0; index <= inStr.length() - 1; index++) {
			int cipherChar = 'A' + 'Z' - inStr.charAt(index);
			System.out.print((char)cipherChar);
		}
	}

}
