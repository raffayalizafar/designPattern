package homeWork.animal;

public class Dog implements Animal {

	@Override
	public void move() {
		System.out.println("Dog Runs");
		
	}
	public void makeSound() {
		System.out.println("Dog Bark");
	}

}
