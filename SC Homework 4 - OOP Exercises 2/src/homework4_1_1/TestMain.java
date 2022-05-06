package src.homework4_1_1;

import java.util.Scanner;

public class TestMain {

	public static void checkNumber(MyComplex number) {
		if (number.isReal()) {
			System.out.println(number + " is a pure real number");
		} else {
			System.out.println(number + " is NOT a pure real number");
		}
		if (number.isImaginary()) {
			System.out.println(number + " is a pure imaginary number");
		} else {
			System.out.println(number + " is NOT a pure imaginary number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter complex number 1 (real and imaginary part) :");
		double real1 = sc.nextDouble();
		double imag1 = sc.nextDouble();
		System.out.println("Enter complex number 2 (real and imaginary part) :");
		double real2 = sc.nextDouble();
		double imag2 = sc.nextDouble();
		MyComplex number1 = new MyComplex(real1, imag1);
		MyComplex number2 = new MyComplex(real2, imag2);
		System.out.println("Number1 is " + number1);
		checkNumber(number1);
		System.out.println("Number2 is " + number2);
		checkNumber(number2);
		
		if (number1.equals(number2)) {
			System.out.println(number1 + " is equals to " + number2);
		} else {
			System.out.println(number1 + " is NOT equals to " + number2);
		}
		System.out.println(number1 + " + " + number2 + " = " + number1.addNew(number2));
		System.out.println(number1 + " - " + number2 + " = " + number1.subtractNew(number2));
		System.out.println(number1 + " * " + number2 + " = " + number1.multiply(number2));
		System.out.println(number1 + " / " + number2 + " = " + number1.divide(number2));
		System.out.printf("Magnitude is: %.2f%n ", number1.magnitude());
	}

}
