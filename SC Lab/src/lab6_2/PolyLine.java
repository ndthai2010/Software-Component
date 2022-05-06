package src.lab6_2;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {

	protected List<Point> points;

	public PolyLine() {
		points = new ArrayList<Point>();
	}

	public PolyLine(List<Point> points) {
		super();
		this.points = points;
	}

	public void appendPoint(int x, int y) {
		Point newPoint = new Point(x, y);
		points.add(newPoint);
	}

	public void appendPoint(Point point) {
		points.add(point);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for (Point aPoint : points) {
			sb.append(aPoint.toString());
		}
		sb.append("}");
		return sb.toString();
	}

	public double getLength() {
		double totalLength = 0;
		for (int index = 0; index < points.size() - 1; index++) {
			int x1 = points.get(index).getX();
			int y1 = points.get(index).getY();
			int x2 = points.get(index + 1).getX();
			int y2 = points.get(index + 1).getY();
			double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			totalLength += distance;
		}
		return totalLength;
	}
}
