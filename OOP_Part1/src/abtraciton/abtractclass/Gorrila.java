package abtraciton.abtractclass;

public class Gorrila extends Animal {

	public Gorrila(String species) {
		super(species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
	
	
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
