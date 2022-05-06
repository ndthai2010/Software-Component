package src.homework3_2_9;
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint myPoint1 = new MyPoint(1, 2);
		MyPoint myPoint2 = new MyPoint(3, 4);
		MyPoint myPoint3 = new MyPoint(4, 5);
		MyTriangle myTriangle = new MyTriangle(myPoint1, myPoint2, myPoint3);
		System.out.println(myTriangle.getPerimeter());
		System.out.println(myTriangle);
		System.out.println(myTriangle.getType());
	}

}
