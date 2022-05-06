package src.homework3_2_8;

public class MyCircle {
	
	private MyPoint center;
	private int radius;

	public MyCircle() {
		center = new MyPoint(0, 0);
		radius = 1;
	}

	public MyCircle(int x, int y, int radius) {
		center.setX(x);
		center.setY(y);
		this.radius = radius;
	}

	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getCenterX() {
		return center.getX();
	}

	public void setCenterX(int x) {
		center.setX(x);
	}

	public int getCenterY() {
		return center.getY();
	}

	public void setCenterY(int y) {
		center.setY(y);
	}

	public int[] getCenterXY() {
		int[] result = new int[2];
		result[0] = center.getX();
		result[1] = center.getY();
		return result;
	}

	public void setCenterXY(int x, int y) {
		center.setX(x);
		center.setY(y);
	}

	@Override
	public String toString() {
		return "MyCircle [center =" + center + ", radius = " + radius + "]";
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getCirumference() {
		return 2 * radius * Math.PI;
	}

	public double distance(MyCircle another) {
		return Math.sqrt(
				Math.pow(center.getX() - another.getCenterX(), 2) + Math.pow(center.getY() - another.getCenterY(), 2));
	}
}
