package src;

import java.util.Scanner;

public class CheckHexStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String hexString = sc.nextLine();
		char[] inChar = hexString.toCharArray();
		boolean checkHexString = true;
		
		for(int index = 0; index <= inChar.length - 1; index++) {
			if(!((inChar[index] >= '0' && inChar[index] <= '9') || 
			(inChar[index] >= 'A' && inChar[index] <= 'F') || (inChar[index] >= 'a' && inChar[index] <= 'f'))){
				checkHexString=false;
				break;
			}
		}
		System.out.println(hexString + (checkHexString ? " is a hex string" : "is not a hex string "));
	}
}
