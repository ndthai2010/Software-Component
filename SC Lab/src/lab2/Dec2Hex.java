package src.lab2;

import java.util.Scanner;

public class Dec2Hex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimalNum = sc.nextInt();
		System.out.print("The equivalent hexadecimal number is: " + transformString(decimalNum));
	}

	public static String transformString(int decimalNum) {
		String hexaNumberString = "";
		String hex = "0123456789ABCDEF";
		while (decimalNum > 0) {
			int value = decimalNum % 16;
			hexaNumberString = hex.charAt(value) + hexaNumberString;
			decimalNum = decimalNum / 16;
		}
		return hexaNumberString;
	}
}
