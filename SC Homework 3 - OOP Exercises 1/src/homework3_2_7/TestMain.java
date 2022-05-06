package src.homework3_2_7;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint myPoint1 = new MyPoint(4, 5);
		MyPoint myPoint2 = new MyPoint(2, 3);
		
		MyLine myLine = new MyLine(myPoint1, myPoint2);
		System.out.println(myLine);
		System.out.println(myLine.getLength());
		System.out.println(myLine.getGradient());
		System.out.println(Arrays.toString(myLine.getBeginXY()));
	}
}
