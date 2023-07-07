package abtraciton.abtractclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal animal = new Animal();
		
	
		Animal cat = new Cat("Cat");
	    cat.makeSound();
	    cat.eat();
	    cat.walk();
	    cat.getAnimalType(); 
	    cat.getSpecies();

	    System.out.println(cat.getSpecies());
	    System.out.println("LivingThing? "+ Animal.LIVING_THING);
	    Animal.sizeStatus(30);
	    
	    Horse araqHorse = new AraqHorse ("Horse");
	    araqHorse.makeSound();
	    araqHorse.eat();
	    araqHorse.walk();
	    araqHorse.getAnimalType();
	    araqHorse.ride();
	}

}
