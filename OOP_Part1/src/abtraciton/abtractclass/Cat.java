package abtraciton.abtractclass;

public class Cat extends Animal{
	
	public Cat(String species) {
		super(species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("Meow Meow");
		
	}
	
	@Override
	public void eat() {
		System.out.println("Fried fish");
	}

	@Override
	public void walk() {
		System.out.println("CatWalk");
	}
	@Override
	public void getAnimalType() {
		System.out.println("This is Cat.Object :"+this);
	}
	
	public void scrach() {
		System.out.println("Cat scrach ");
		
	}
}
