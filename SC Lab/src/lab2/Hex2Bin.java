package src.lab2;

import java.util.Scanner;

public class Hex2Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Hexadecimal string: ");
		String hexaDecimal = sc.next().toUpperCase();
		String hexaString = "0123456789ABCDEF";
		final String[] hexBits = { "0000", " 0001 ", " 0010 ", " 0011 ", " 0100 ", " 0101 ", " 0110 ", " 0111 ",
				" 1000 ", " 1001 ", " 1010 ", " 1011 ", " 1100 ", " 1101 ", " 1110 ", " 1111 " };
		
		for (int index = 0; index < hexaDecimal.length(); index++) {
			char getChar = hexaDecimal.charAt(index);
			System.out.print(hexBits[hexaString.indexOf(getChar)]);
		}
	}
}
