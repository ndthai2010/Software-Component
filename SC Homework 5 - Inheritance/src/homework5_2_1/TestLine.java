package src.homework5_2_1;

public class TestLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line l1 = new Line(0, 0, 3, 4);
		System.out.println(l1);
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(4, 5);
		Line l2 = new Line(p1, p2);
		System.out.println(l2);
		
		l1.setBeginXY(4, 5);
		System.out.printf("Length: %.2f%n", l1.getLength());
		System.out.printf("Gradient: %.2f%n", l1.getGradient());
	}

}
