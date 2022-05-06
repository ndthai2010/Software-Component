package src.homework3_1_1;
public class TestCircle {

	public static void main(String args[]) {
		Circle circle1 = new Circle();
		System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea());
		System.out.println("The circle has color " + circle1.getColor());

		Circle circle2 = new Circle(2.0);
		System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " + circle2.getArea());

		Circle circle3 = new Circle(2.0, "blue");
		System.out.println(circle3.toString());

		Circle circle4 = new Circle();
		circle4.setRadius(5.5);
		System.out.println("Radius is: " + circle4.getRadius());
		circle4.setColor("green");
		System.out.println("Color is: " + circle4.getColor());

		Circle circle5 = new Circle(5.5);
		System.out.println(circle5.toString());

		Circle circl6 = new Circle(6.6);
		System.out.println(circl6.toString());
		System.out.println(circl6);
		System.out.println("Operator + invokes toString() too: " + circl6);
	}
}
