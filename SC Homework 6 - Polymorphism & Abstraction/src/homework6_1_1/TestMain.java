package src.homework6_1_1;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape1 = new Circle("red", false, 5.5); // upcast
		System.out.println(shape1);
		System.out.println(shape1.getArea());
		System.out.println(shape1.getPerimeter());
		System.out.println(shape1.getColor());
		System.out.println(shape1.isFilled());
		System.out.println("---------------");

		if (shape1 instanceof Circle) {
			Circle circle1 = (Circle) shape1; // downcast
			System.out.println(circle1);
			System.out.println(circle1.getArea());
			System.out.println(circle1.getPerimeter());
			System.out.println(circle1.getColor());
			System.out.println(circle1.isFilled());
			System.out.println(circle1.getRadius());
			System.out.println("---------------");
		}

		Shape shape3 = new Rectangle("red", false, 1.0, 2.0); // upcast
		System.out.println(shape3);
		System.out.println(shape3.getArea());
		System.out.println(shape3.getPerimeter());
		System.out.println(shape3.getColor());
		System.out.println("---------------");

		if (shape3 instanceof Rectangle) {
			Rectangle rectangle1 = (Rectangle) shape3; // downcast
			System.out.println(rectangle1);
			System.out.println(rectangle1.getArea());
			System.out.println(rectangle1.getPerimeter());
			System.out.println(rectangle1.getLength());
			System.out.println("---------------");

		}

		Shape shape4 = new Square(6.6); // upcast
		System.out.println(shape4);
		System.out.println(shape4.getArea());
		System.out.println(shape4.getColor());
		System.out.println("---------------");

		if (shape4 instanceof Rectangle) {
			Rectangle rectangle2 = (Rectangle) shape4; // downcast
			System.out.println(rectangle2);
			System.out.println(rectangle2.getArea());
			System.out.println(rectangle2.getColor());
			System.out.println(rectangle2.getLength());
			System.out.println("---------------");

			if (rectangle2 instanceof Square) {
				Square square1 = (Square) rectangle2; // downcast
				System.out.println(square1);
				System.out.println(square1.getArea());
				System.out.println(square1.getColor());
				System.out.println(square1.getSide());
				System.out.println(square1.getLength());
			}
		}
	}
}
