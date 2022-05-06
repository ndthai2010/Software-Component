package src.homework6_1_6;

public abstract class Animal {

	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public abstract void greets(); //abstract method
}
