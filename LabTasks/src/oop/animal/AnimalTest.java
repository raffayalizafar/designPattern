package oop.animal;

public class AnimalTest {

	public static void main(String[] args) {

		Animal[] animal= new Animal[6];
		animal[0]=new Fox();
		animal[1]=new Fox();
		animal[2]=new Bird();
		animal[3]=new Frog();
		animal[4]=new Bird();
		animal[5]=new Dog();
		move(animal);
		Dog ldog =new LeapDog();
		ldog.move();
//		if (ldog.instanceof(Dog)) {
//			System.out.println("True");
//		}
	}

	private static void move(Animal[] animal) {
		for(Animal a:animal) {
			a.move();
		}
	}

}
