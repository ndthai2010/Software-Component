package src.homework4_1_6;
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball ball = new Ball(50, 50, 5, 10, 30);
		Container box = new Container(0, 0, 100, 100);
		for (int index = 0; index < 100; index++) {
			ball.move();
			box.collidesWith(ball);
			System.out.println(ball);
		}
	}

}
