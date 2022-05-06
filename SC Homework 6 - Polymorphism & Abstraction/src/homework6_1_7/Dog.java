package src.homework6_1_7;

public class Dog extends Animal {

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("Woof");
	}

	public void greeting(Dog another) {
		System.out.println("Wooooooof");
	}
}
