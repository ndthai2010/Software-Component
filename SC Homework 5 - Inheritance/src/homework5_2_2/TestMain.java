package src.homework5_2_2;

public class TestMain {

	public static void main(String args[]) {
		Circle circle = new Circle(2.2, "blue");
		System.out.println(circle);
		
		Cylinder cylinder1 = new Cylinder(circle, 4.3);
		System.out.println(cylinder1);
		
		Cylinder cylinder2 = new Cylinder();
		System.out.println(cylinder2);
	}
}
