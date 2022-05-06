package src;
public class FibonacciInt {

	public static void main(String[] args) {
		System.out.println("Check the int Fibonacci : ");
		printFibonacciInt();
	}

	public static void printFibonacciInt() {
		int fnMinius1 = 1;
		int fnMinius2 = 1;
		int fn = 0;
		int n = 1;
		System.out.printf("F(%1$d) = %2$d%n", 0, fnMinius1);
		System.out.printf("F(%1$d) = %2$d%n", 1, fnMinius2);
		while (true) {
			fn = fnMinius1 + fnMinius2;
			n++;
			if (Integer.MAX_VALUE - fnMinius1 > fnMinius2) {
				System.out.printf("F(%1$d) = %2$d%n", n, fn);
			} else {
				System.out.printf("F(%1$d) is out of the range of int.%n", n);
				break;
			}
			fnMinius2 = fnMinius1;
			fnMinius1 = fn;
		}
	}
}
