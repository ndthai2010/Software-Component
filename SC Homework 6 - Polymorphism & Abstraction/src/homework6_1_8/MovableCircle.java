package src.homework6_1_8;

public class MovableCircle implements Movable {

	private double radius;
	private MovablePoint center;

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, double radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "(" + center.x + "," + center.y + "), speed = (" + center.x + "," + center.y + "), radius = " + radius;
	}

	public void moveUp() {
		center.y -= center.ySpeed;
	}

	public void moveDown() {
		center.y += center.ySpeed;
	}

	public void moveLeft() {
		center.x -= center.xSpeed;
	}

	public void moveRight() {
		center.x += center.xSpeed;
	}
}
