package src.homework5_1_5;

public class Dog extends Mammal {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooooof");
	}

	@Override
	public String toString() {
		return "Dog [" + super.toString() + "]";
	}
	
	
}
