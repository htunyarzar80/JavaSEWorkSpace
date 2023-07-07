package polymorphism;

public class Gorrila extends Animal {

	@Override
	public void makeSound() {
	
		super.makeSound();
		System.out.println("Gyarr... ");
	}
	
	@Override
	public void eat() {
		System.out.println("Banana");
	}
	
	@Override
	public void walk() {
		System.out.println("Kwta");
	}
	
	@Override
	public void getAnimalType() {
	
		System.out.println("This is Groilla.Object "+this);
	}
}
