package src.homework5_1_3;

public class Point2D {

	protected float x;
	protected float y;

	public Point2D() {
		super();
		x = 0.0f;
		y = 0.0f;
	}

	public Point2D(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float[] getXY() {
		float[] res = new float[2];
		res[0] = x;
		res[1] = y;
		return res;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

}
