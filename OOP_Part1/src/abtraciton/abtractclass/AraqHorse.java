package abtraciton.abtractclass;

public class AraqHorse extends Horse{

	public AraqHorse(String species) {
		super(species);
		// TODO Auto-generated constructor stub
	}
//
	@Override
	public void ride() {
		System.out.println("Can ride fastest");
	}
	
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("heeeee..");
	}

	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Grass");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("walk like horse");
	}

	@Override
	public void getAnimalType() {
		// TODO Auto-generated method stub
		System.out.println("This is AraqHorse : Object ");
	}
	
	

}
