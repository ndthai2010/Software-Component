package src.lab1;

import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius, diameter, circumference, area;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		radius = sc.nextDouble();
		sc.close();
		
		diameter = 2.0 * radius;
		area = Math.PI * radius * radius;
		circumference = 2.0 * Math.PI * radius;
		System.out.printf("Diameter is: %.2f%n", diameter);
		System.out.printf("Area is: %.2f%n", area);
		System.out.printf("Circumference is: %.2f%n", circumference);
		
		double surfaceArea = 4 * Math.PI * radius * radius;
		double volume = 4 /3 * Math.PI * radius * radius * radius;
		System.out.printf("Surface Area is: %.2f%n", surfaceArea);
		System.out.printf("Volume is: %.2f%n", volume);
		
		double baseArea = Math.PI * radius * radius;
		double surfaceArea1 = 2.0 * Math.PI * radius + 2.0 * baseArea;
		System.out.printf("Base Area is: %.2f%n", baseArea);
		System.out.printf("Surface Area 1 is: %.2f%n", surfaceArea1);
		
	}

}
