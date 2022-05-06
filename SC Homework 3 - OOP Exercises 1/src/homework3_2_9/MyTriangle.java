package src.homework3_2_9;
public class MyTriangle {

	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;

	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		v1.setX(x1);
		v2.setX(x2);
		v3.setX(x3);
		v3.setY(y3);
		v2.setY(y2);
		v1.setY(y1);
	}

	@Override
	public String toString() {
		String result = String.format("MyTriangle[v1=(%d,%d),v2=(%d,%d),v3=(%d,%d)]", v1.getX(), v1.getY(), v2.getX(),
				v2.getY(), v3.getX(), v3.getY());
		return result;
	}

	public double getPerimeter() {
		double AB = v1.distance(v2);
		double AC = v2.distance(v3);
		double BC = v3.distance(v1);
		return AB + BC + AC;
	}

	public String getType() {
		double AB = v1.distance(v2);
		double AC = v2.distance(v3);
		double BC = v3.distance(v1);
		if (AB == AC && AC == BC) {
			return "Equilateral";
		} else if (AB == AC || AB == BC || BC == AC) {
			return "Isosceles";
		} else {
			return "Scalene";
		}
	}
}
