package src.homework6_1_8;

public class MovableRectangle implements Movable {

	protected MovablePoint topLeft;
	protected MovablePoint bottomRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		topLeft.y += topLeft.ySpeed;
		bottomRight.y += bottomRight.ySpeed;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		topLeft.y -= topLeft.ySpeed;
		bottomRight.y -= bottomRight.ySpeed;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		topLeft.x -= topLeft.xSpeed;
		bottomRight.x -= bottomRight.xSpeed;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		topLeft.x += topLeft.xSpeed;
		bottomRight.x += bottomRight.xSpeed;
	}

	@Override
	public String toString() {
		return "Top Left = (" + topLeft.x + "," + topLeft.y + "), Bottom Right = (" + bottomRight.x + ","
				+ bottomRight.y + "), Speed = (" + topLeft.xSpeed + "," + topLeft.ySpeed + ")";
	}

}
