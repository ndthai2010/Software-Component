package src;
import java.util.Scanner;

public class DecipherCaesarCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String inStr = sc.next().toUpperCase();
		
		for(int index = 0; index <= inStr.length() - 1; index++) {
			switch (inStr.charAt(index)) {
			case 'X':
				System.out.print("X");
				break;
				
			case 'Y':	
				System.out.print("Y");
				break;
				
			case 'Z':	
				System.out.print("Z");
				break;
				
			default:
				int num = (int) inStr.charAt(index);
				char restoreChar = (char) (num - 3);
				System.out.print(restoreChar);
				break;
			}
		}
	}
}
