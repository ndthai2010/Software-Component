package src.homework6_1_5;

public class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void resize(int percent) {
		// TODO Auto-generated method stub
		super.radius *= (percent / 100.0);
	}

	@Override
	public String toString() {
		return "ResizableCircle [" + super.toString() + "]";
	}

}
