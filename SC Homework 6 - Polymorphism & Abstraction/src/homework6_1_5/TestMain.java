package src.homework6_1_5;

public class TestMain {

	public static void main(String args[]) {
		GeometricObject g1 = new Circle(2.4); // upcast
		System.out.println(g1);
		System.out.println(g1.getArea());
		System.out.println(g1.getPerimeter());
		System.out.println("------------");

		Circle c1 = new ResizableCircle(2.7); // upcast
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());

		Resizable r1 = new ResizableCircle(3.0); // upcast
		System.out.println(r1);
		r1.resize(10);
		System.out.println(r1);
		System.out.println("------------");

		ResizableCircle r2 = (ResizableCircle) r1; // downcast
		System.out.println(r2);
		r2.resize(5);
		System.out.println(r2);
	}
}
