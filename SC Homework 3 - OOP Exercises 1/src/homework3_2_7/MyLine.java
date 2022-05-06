
package src.homework3_2_7;
public class MyLine {
	
	private MyPoint begin;
	private MyPoint end;

	public MyLine(int x1, int y1, int x2, int y2) {
		begin = new MyPoint(x1, y1);
		end = new MyPoint(x2, y2);
	}

	public MyLine(MyPoint begin, MyPoint end) {
		this.begin = begin;
		this.end = end;
	}

	public MyPoint getBegin() {
		return begin;
	}

	public void setBegin(MyPoint begin) {
		this.begin = begin;
	}

	public MyPoint getEnd() {
		return end;
	}

	public void setEnd(MyPoint end) {
		this.end = end;
	}

	public void setBeginX(int x) {
		begin.setX(x);
	}

	public int getBeginX() {
		return begin.getX();
	}

	public void setBeginY(int y) {
		begin.setX(y);
	}

	public int getBeginY() {
		return begin.getY();
	}

	public void setEndX(int x) {
		end.setX(x);
	}

	public int getEndX() {
		return end.getX();
	}

	public void setEndY(int y) {
		begin.setX(y);
	}

	public int getEndY() {
		return end.getY();
	}

	public int[] getBeginXY() {
		int[] result = new int[2];
		result[0] = begin.getX();
		result[1] = begin.getY();
		return result;
	}

	public void setBeginXY(int x, int y) {
		begin.setX(x);
		begin.setY(y);
	}

	public int[] getEndXY() {
		int[] result = new int[2];
		result[0] = end.getX();
		result[1] = end.getY();
		return result;
	}

	public void setEndXY(int x, int y) {
		end.setX(x);
		end.setY(y);
	}

	public double getLength() {
		return Math.sqrt(Math.pow((begin.getX() - end.getX()), 2) + Math.pow(begin.getY() - end.getY(), 2));
	}

	@Override
	public String toString() {
		String result = String.format("MyLine[begin = (%d,%d),end = (%d,%d)]", begin.getX(), begin.getY(), end.getX(),
				end.getY());
		return result;
	}

	public double getGradient() {
		return Math.atan2(Math.pow(begin.getX() - end.getX(), 2), Math.pow(begin.getY() - end.getY(), 2));
	}
}
