package src.homework5_1_3;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D point2d = new Point2D(2.2f, 3.2f);
		System.out.println(point2d);
		System.out.println("-------------");

		point2d.setXY(2.5f, 3.5f);
		System.out.println(point2d);
		System.out.println(point2d.getXY()[0]);
		System.out.println(point2d.getXY()[1]);
		System.out.println("-------------");

		Point3D point3d = new Point3D(1.2f, 2.1f, 3.3f);
		System.out.println(point3d);
		System.out.println("-------------");

		point3d.setXYZ(2.5f, 3.6f, 4.1f);
		System.out.println(point3d);
		System.out.println(point3d.getXYZ()[0]);
		System.out.println(point3d.getXYZ()[1]);
		System.out.println(point3d.getXYZ()[2]);
		
		Point2D point4 = new Point3D(2, 4, 5);
		System.out.println(point4);
		
		Point3D point5 = (Point3D) point4;
		point5.setXYZ(2, 1, 4);
		System.out.println(point5);

	}

}
