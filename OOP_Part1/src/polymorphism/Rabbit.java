package polymorphism;

public class Rabbit extends Animal {
	
	@Override
	public void makeSound() {
	
		System.out.println("Shee Shee ");
	}
	
	@Override
	public void eat() {
	
		System.out.println("Dried Grass");
	}
	
	@Override
	public void walk() {
	
		System.out.println("Jump Jump");
	}
	
	@Override
	public void getAnimalType() {
		System.out.println("This is Rabbit.Object :"+this);
	}

	
	public void jump() {
		System.out.println("Rabbit can Jump");
	}
}
