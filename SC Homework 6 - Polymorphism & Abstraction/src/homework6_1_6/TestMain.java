package src.homework6_1_6;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat1 = new Cat("A");
		cat1.greets();

		Dog dog1 = new Dog("B");
		dog1.greets();

		BigDog bigDog1 = new BigDog("C");
		bigDog1.greets();

		Animal a1 = new Cat("D"); // upcast
		a1.greets();

		Animal a2 = new Dog("E"); // upcast
		a2.greets();

		Animal a3 = new BigDog("F"); // upcast
		a3.greets();

		Dog dog2 = (Dog) a2; // downcast
		BigDog bigDog2 = (BigDog) a3; // downcast
		Dog dog3 = (Dog) a3; // downcast

		dog2.greets(dog3);
		dog2.greets(bigDog2);

	}

}
