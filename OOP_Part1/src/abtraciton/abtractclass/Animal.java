package abtraciton.abtractclass;

public abstract class Animal {
	
	static final boolean LIVING_THING = true;
	
	private String species;
	
    static void sizeStatus(int pound) {
    	if (pound < 5 && pound >0) 
    		System.out.println("Small Animal");
    	else if (pound >5 && pound <20 ) 
    		System.out.println("Average Size Animal");
    	else if (pound >= 20)
    	    System.out.println("Big Size Animal");
        else 
    	    System.out.println("Invalid Data");
    	}

	public Animal(String species) {
		super();
		this.species = species;
	}

	public abstract void makeSound(); 
	
	public abstract void eat(); 

	public  abstract void walk();
	
	public abstract void getAnimalType();

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
}
