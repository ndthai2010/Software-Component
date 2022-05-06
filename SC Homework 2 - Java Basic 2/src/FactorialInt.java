package src;
public class FactorialInt {

	public static void main(String[] args) {
		System.out.println("Check Int factorials : ");
		printFactorialInt();
		System.out.println("Check Long factorials : ");
		printFactorialLong();
	}

	public static void printFactorialInt() {
		int n = 1;
		int fn = 1;
		while (true) {
			System.out.printf("The factorial of %1$d is is %2$d.%n", n, fn);
			if (Integer.MAX_VALUE / fn < (n + 1)) {
				System.out.printf("The factorial of %d is out of range.%n", (n + 1));
				break;
			}
			n++;
			fn *= n;
		}
		System.out.println();
	}

	public static void printFactorialLong() {
		long n = 1L;
		long fn = 1L;
		while (true) {
			System.out.printf("The factorial of %1$d is is %2$d.%n", n, fn);
			if (Long.MAX_VALUE / fn < (n + 1)) {
				System.out.printf("The factorial of %d is out of range.%n", (n + 1));
				break;
			}
			n++;
			fn *= n;
		}
	}
}
