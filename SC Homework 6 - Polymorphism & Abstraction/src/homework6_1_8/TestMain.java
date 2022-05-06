package src.homework6_1_8;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable m1 = new MovablePoint(2, 5, 4, 3); // upcast
		System.out.println(m1);
		m1.moveUp();
		System.out.println(m1);
		System.out.println("------------");

		Movable m2 = new MovableCircle(4, 2, 6, 7, 2.2); // upcast
		System.out.println(m2);
		m2.moveDown();
		System.out.println(m2);
		System.out.println("------------");

		MovablePoint m3 = (MovablePoint) m1; // downcast
		m3.moveLeft();
		System.out.println(m3);
		System.out.println("------------");

		MovableCircle m4 = (MovableCircle) m2; // downcast
		m4.moveRight();
		System.out.println(m4);
		System.out.println("------------");

		Movable m5 = new MovableRectangle(2, 3, 4, 1, 3, 2); // upcast
		System.out.println(m5);
		m5.moveUp();
		System.out.println(m5);
		System.out.println("------------");

		MovableRectangle m6 = (MovableRectangle) m5; // downcast
		m6.moveLeft();
		System.out.println(m6);
	}

}
