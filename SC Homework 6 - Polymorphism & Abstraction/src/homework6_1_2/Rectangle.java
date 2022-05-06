package src.homework6_1_2;

public class Rectangle implements GeometricObject {

	private double width;
	private double length;

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle [width = " + width + ", length = " + length + "]";
	}

	public double getArea() {
		return width * length;
	}

	public double getPerimeter() {
		return (length + width) * 2;
	}
}
