package src;
import java.util.Scanner;

public class BoxPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (col == size || row == 1 || row == size || col == 1) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("\n");
		}

		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row == col || row == 1 || row == size) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("\n");
		}

		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row + col == size + 1 || row == 1 || row == size) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("\n");
		}

		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (row + col == size + 1 || row == col || row == size || row == 1) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("\n");
		}
	}

}
