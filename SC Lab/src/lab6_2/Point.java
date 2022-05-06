package src.lab6_2;

public class Point {

	protected int x;
	protected int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int[] getXY() {
		int[] res = new int[2];
		res[0] = x;
		res[1] = y;
		return res;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + "),";
	}

	public double distance(Point another) {
		return Math.sqrt(Math.pow(this.x - another.getX(), 2) + Math.pow(this.y - another.getY(), 2));
	}
}
