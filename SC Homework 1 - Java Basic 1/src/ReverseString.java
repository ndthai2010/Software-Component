package src;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inStr;
		String reverse = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		inStr = sc.next();
	    int inStrLen = inStr.length();
		
		for(int charIdx = inStrLen - 1 ; charIdx >= 0; charIdx--){
			reverse += inStr.charAt(charIdx);
		}
		
		System.out.println("The reverse  " + inStr + " is " + reverse);
	}

}
