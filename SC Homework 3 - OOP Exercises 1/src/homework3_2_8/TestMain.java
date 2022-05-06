package src.homework3_2_8;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint myPoint = new MyPoint(3, 4);
		System.out.println(myPoint);
		MyCircle myCircle = new MyCircle(myPoint, 4);
		
		System.out.println(myCircle);
		System.out.println(myCircle.getArea());
		System.out.println(myCircle.getCirumference());
		System.out.println(myCircle.distance(new MyCircle(new MyPoint(1, 2), 2)));
	}

}
