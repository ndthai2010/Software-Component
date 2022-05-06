package src.homework5_1_4;

public class TestMain {

	public static void main(String args[]) {
		Shape shape = new Shape();
		System.out.println(shape);

		Circle circle = new Circle(2.2);
		System.out.println(circle);
		System.out.printf("%.2f%n", circle.getArea());
		System.out.printf("%.2f%n", circle.getPerimeter());

		Rectangle rectangle = new Rectangle("blue", true, 3.2, 2.5);
		System.out.println(rectangle);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());

		Square square = new Square(2.5);
		System.out.println(square);
		System.out.println(square.getArea());
		System.out.println(square.getPerimeter());
		
	}
}
