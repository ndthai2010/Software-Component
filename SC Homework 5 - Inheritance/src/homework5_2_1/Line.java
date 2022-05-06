package src.homework5_2_1;

public class Line {

	private Point begin;
	private Point end;

	public Line(Point begin, Point end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	public Line(int beginX, int beginY, int endX, int endY) {
		begin = new Point(beginX, beginY);
		end = new Point(endX, endY);
	}

	@Override
	public String toString() {
		return String.format("MyLine[begin = (%d,%d), end = (%d,%d)", begin.getX(), begin.getY(), end.getX(),
				end.getY());
	}

	public Point getBegin() {
		return begin;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public void setBeginX(int x) {
		begin.setX(x);
	}

	public void setBeginY(int y) {
		begin.setY(y);
	}

	public void setBeginXY(int x, int y) {
		begin.setX(x);
		begin.setY(y);
	}

	public void setEndX(int x) {
		end.setX(x);
	}

	public void setEndY(int y) {
		end.setY(y);
	}

	public void setEndXY(int x, int y) {
		end.setX(x);
		end.setY(y);
	}

	public double getLength() {
		return Math.sqrt(Math.pow(begin.getX() - end.getX(), 2) + Math.pow(begin.getY() - end.getY(), 2));
	}

	public double getGradient() {
		return Math.atan2(Math.pow(begin.getY() - end.getY(), 2), Math.pow(begin.getX() - end.getX(), 2));
	}
}
