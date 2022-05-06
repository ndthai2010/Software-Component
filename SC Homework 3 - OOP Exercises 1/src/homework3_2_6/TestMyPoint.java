package src.homework3_2_6;

public class TestMyPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint point1 = new MyPoint(3, 4);
		System.out.printf("%.2f%n", point1.distance(5, 6));
		MyPoint point2 = new MyPoint(5, 6);
		System.out.printf("%.2f%n", point1.distance(point2));
		System.out.printf("%.2f%n", point1.distance());
		System.out.println(point1);
		point1.setX(8);
		point1.setY(6);
		System.out.println("x is: " + point1.getX());
		System.out.println("y is: " + point1.getY());
		point1.setXY(3, 0);
		System.out.println(point1.getXY()[0]);
		System.out.println(point1.getXY()[1]);
		System.out.printf("%.2f%n", point2.distance(point1));
		MyPoint[] myPoints = new MyPoint[10];

		for (int i = 0; i < myPoints.length; i++) {
			myPoints[i] = new MyPoint(i + 1, i + 1);
			System.out.println(myPoints[i]);
		}
	}
}
