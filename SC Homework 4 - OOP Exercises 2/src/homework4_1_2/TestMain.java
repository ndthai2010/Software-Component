package src.homework4_1_2;
public class TestMain {

	public static void main(String args[]) {
		MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
		MyPolynomial polynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
		System.out.println("polynomial1 is :" + polynomial1);

		double[] coeffs = { 1.2, 3.4, 5.6, 7.8 };
		MyPolynomial polynomial3 = new MyPolynomial(coeffs);

		System.out.println();
		System.out.println("The degree of polynomial 1: " + polynomial1.getDegree());
		System.out.println("Evaluate polynomial 2 of 10: " + polynomial2.evaluate(10));
		System.out.println();
		System.out.println("Add polynomial 2 and polynomial 3: " + polynomial2.add(polynomial3));
		System.out.println();
		System.out.println("Multiply polynomial 1 and polynomial 3: " + polynomial1.add(polynomial3));
	}
}
