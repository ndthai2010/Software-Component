package src.homework6_1_6;

public class BigDog extends Dog {

	public BigDog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void greets() {
		// TODO Auto-generated method stub
		System.out.println("Wooow");
	}

	@Override
	public void greets(Dog another) {
		// TODO Auto-generated method stub
		System.out.println("Wooooooow");
	}

	public void greets(BigDog another) {
		System.out.println("Wooooooooooow");
	}
}
