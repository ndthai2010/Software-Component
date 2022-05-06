package src;

import java.util.Scanner;

public class TimeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();

		for (int row = -1; row <= size; row++) {
			if (row == -1) {
				System.out.printf("%s\t|", "*");
			} else if (row == 0) {
				System.out.print("------------");
			} else if (row > 0) {
				System.out.printf("%1$d\t|", row);
			}

			for (int col = 1; col <= size; col++) {
				if (row == -1) {
					System.out.printf("\t%1$d", col);
					continue;
				} else if (row == 0) {
					System.out.print("--------");
					continue;
				}

				System.out.printf("\t%1$d", row * col);
			}
			System.out.println();
		}
	}

}
