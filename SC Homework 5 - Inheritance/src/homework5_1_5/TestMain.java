package src.homework5_1_5;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal("Chicken");
		System.out.println(animal);
		
		Cat cat = new Cat("Tom");
		System.out.println(cat);
		cat.greets();
		
		Dog dog1 = new Dog("Mic");
		System.out.println(dog1);
		dog1.greets();
		
		Dog dog2 = (Dog) dog1;
		dog2.greets(dog1);
		
		Animal[] listAnimals = new Animal[200];
		for(int i = 0; i < 100; i++) {
			String nameCat = "Meow" + i;
			String nameDog = "Woof" + i;
			listAnimals[i] = new Cat(nameCat);
			listAnimals[i] = new Dog(nameDog);
		}	
	
	}

}
