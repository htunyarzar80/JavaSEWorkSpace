package polymorphism;

public class Animal {
	
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

	 private void antiLifeEquation() {
		 System.out.println("Bring death to all livingthings `");
	 }
	 
	 public void storyTeller() {
		 System.out.println("Long long ago, the mightly god created "
	            +"aniLife Formula");
		 System.out.println("That formula can do :");
		 antiLifeEquation();
	 }
	
	public void makeSound() {
		System.out.println("GuuGuuGarGar");	
	}
	
	public void eat() {
		System.out.println("Eatable Food");
	}

	public void walk (){
		System.out.println("Walk  like animal");
		}
	
	public void getAnimalType() {
		System.out.println("This is anmial");
	}
	
	/*final*/ void canControlAnimal() {
		System.out.println("Animal can control child");
	}
}
