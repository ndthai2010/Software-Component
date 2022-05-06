package src.homework6_1_7;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat1 = new Cat();
		cat1.greeting();

		Dog dog1 = new Dog();
		dog1.greeting();

		BigDog bigDog1 = new BigDog();
		bigDog1.greeting();

		Animal a1 = new Cat(); // upcast
		a1.greeting();

		Animal a2 = new Dog(); // upcast
		a2.greeting();

		Animal a3 = new BigDog(); // upcast
		a3.greeting();

		Dog dog2 = (Dog) a2; // downcast
		BigDog bigDog2 = (BigDog) a3; // downcast
		Dog dog3 = (Dog) a3; // downcast

		dog2.greeting(dog3);
		dog3.greeting(dog2);
		dog2.greeting(bigDog2);
		bigDog2.greeting(dog2);
		bigDog2.greeting(bigDog1);

	}

}
