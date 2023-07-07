package abtraciton.abtractclass;

public class Dog extends Animal{
	public Dog(String species) {
		super(species);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void makeSound() {
	
		System.out.println(" Woof Woof");
	}
	

	@Override
	public void eat() {
	
		System.out.println("Beef");
	}
	
	@Override
	public void walk() {
	
		System.out.println("Lazy Walking");
	}

	@Override
	public void getAnimalType() {
		System.out.println("This is Dog.Object :"+this);
	}

	public void bite() {
		System.out.println("Dog can bite");
	}
}
