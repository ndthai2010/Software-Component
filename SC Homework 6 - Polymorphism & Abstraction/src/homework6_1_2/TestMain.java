package src.homework6_1_2;

public class TestMain {

	public static void main(String args[]) {
		GeometricObject g1 = new Circle(2.2); // upcast
		System.out.println(g1);
		System.out.println(g1.getPerimeter());
		System.out.println(g1.getArea());
		System.out.println("--------------");

		GeometricObject g2 = new Rectangle(1.2, 2.5); // upcast
		System.out.println(g2);
		System.out.println(g2.getPerimeter());
		System.out.println(g2.getArea());
		System.out.println("--------------");

		Circle c1 = (Circle) g1; // downcast
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println("--------------");

		Rectangle r1 = (Rectangle) g2; // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
	}

}
