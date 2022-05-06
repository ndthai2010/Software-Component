package src.homework5_1_4;

public class Square extends Rectangle {

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(double side, String color, boolean filled) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(double side) {
		super(side, side);
	}

	public double getSide() {
		// TODO Auto-generated method stub
		return super.getWidth();
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return super.getWidth();
	}

	@Override
	public void setWidth(double side) {
		// TODO Auto-generated method stub
		super.setWidth(side);
	}

	@Override
	public void setLength(double side) {
		// TODO Auto-generated method stub
		super.setLength(side);
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		return super.getLength();
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return super.getPerimeter();
	}

	@Override
	public String toString() {
		return "Square [" + super.toString() + "]";
	}

}
