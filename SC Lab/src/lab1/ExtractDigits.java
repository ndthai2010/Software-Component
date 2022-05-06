package src.lab1;

public class ExtractDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 15423;
		
		while (number > 0) {
			int digit = number % 10;
			System.out.println(digit + " ");
			number = number / 10;
		}
	}

}
