package src.lab1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int fn;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int nMax = 20;
		int sum = fnMinus1 + fnMinus2;
		double average;
		
		System.out.println("The first " + nMax + " Fibonacci numbers are: ");
		while (n <= nMax) {
			fn = fnMinus1 + fnMinus2;
			sum += fn;
			System.out.println(fn + " ");
			n++;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
		}
		
		System.out.println("");
		average = (double) sum / 20;
		System.out.println("The average is " + average);
	}

}
