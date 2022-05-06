package src.homework5_2_1;

public class TestLineSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point(3, 3);
		Point p2 = new Point(6, 4);
		
		LineSub lineSub1 = new LineSub(0, 0, 5, 7);
		System.out.println(lineSub1);
		
		LineSub lineSub2 = new LineSub(p1, p2);
		System.out.println(lineSub2);
		
		lineSub1.setBeginXY(6, 8);
		lineSub1.setEndXY(5, 3);
		System.out.println(lineSub1);
		System.out.printf("Length: %.2f%n", lineSub1.getLength());
		System.out.printf("Gradient: %.2f%n", lineSub1.getGradient());
	}
}
