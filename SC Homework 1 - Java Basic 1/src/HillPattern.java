package src;
import java.util.Scanner;

public class HillPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numRows: ");
		int numRows = sc.nextInt();

		for (int row = 1; row <= numRows; row++) {
			for (int col = 1; col <= numRows; col++) {
				if ((row + col >= numRows + 1)) {
					System.out.print(" # ");
				} else {
					System.out.print("   ");
				}
			}
			for (int col = numRows + 1; col <= 2 * numRows - 1; col++) {
				if ((row >= col - numRows + 1)) {
					System.out.print(" # ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println("");
		}

		for (int row = 1; row <= numRows; row++) {
			for (int col = 1; col <= numRows; col++) {
				if ((row <= col)) {
					System.out.print(" # ");
				} else {
					System.out.print("   ");
				}
			}
			for (int col = numRows + 1; col <= 2 * numRows - 1; col++) {
				if ((row + col <= 2 * numRows)) {
					System.out.print(" # ");
				}
			}
			System.out.println("");
		}

		
	}
}
