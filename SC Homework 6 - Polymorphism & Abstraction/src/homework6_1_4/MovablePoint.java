package src.homework6_1_4;

public class MovablePoint implements Movable {
	
	protected int x;
	protected int y;
	protected int xSpeed;
	protected int ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + "), " + "speed = (" + x + "," + y + ")";
	}

	public void moveUp() {
		y -= ySpeed;
	}

	public void moveDown() {
		y += ySpeed;
	}

	public void moveLeft() {
		x -= xSpeed;
	}

	public void moveRight() {
		x += xSpeed;
	}
}
