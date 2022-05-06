package src.homework6_1_3;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovablePoint m1 = new MovablePoint(2, 3, 5, 7); //upcast
		System.out.println(m1);
		m1.moveDown();
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		System.out.println("------------");
		
		Movable m2 = new MovablePoint(4, 3, 2, 7); //upcast
		m2.moveUp();
		System.out.println(m2);
		System.out.println("------------");
		
		MovablePoint m3 = (MovablePoint) m2; //downcast
		m3.moveRight();
		System.out.println(m3);
	}

}
