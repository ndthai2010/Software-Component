package src.homework5_1_3;

public class Point3D extends Point2D {

	private float z;

	public Point3D() {
		super();
		z = 0.0f;
		// TODO Auto-generated constructor stub
	}

	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public void setXYZ(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public float[] getXYZ() {
		float[] res = new float[3];
		res[0] = super.getX();
		res[1] = super.getY();
		res[2] = z;
		return res;
	}

	@Override
	public String toString() {
		return "(" + super.getX() + "," + super.getY() + "," + z + ")";
	}

}
