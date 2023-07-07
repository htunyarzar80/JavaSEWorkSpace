package polymorphism;

public class main {
	
	//generalized
	static void addZoo (Animal animal) {
		animal.getAnimalType();
	}
	
	static void addAllZoo(Animal[] animals) {
		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Animal cat = new Cat();
		cat.eat();
		cat.makeSound();
		cat.walk();
		cat.getAnimalType();
		cat.canControlAnimal();
		cat.storyTeller();
		
//		cat.antiLifeEquation();
		
//		Animal animal = new Animal();
//		animal.eat();
//		animal.makeSound();
//		animal.walk();
//		animal.getAnimalType();
		
		
//    	Animal cat1 = new Cat();
////		addZoo(cat1);
////		
//  		Animal dog1 = new Dog();
////		addZoo(dog1);
////		
//		Animal rabbit1 = new Rabbit();
////		addZoo(rabbit1);
////		
//		Animal gorrila1= new Gorrila();
////		addZoo(groila1);
//		
//		Animal [] animals = {cat1,dog1,rabbit1,gorrila1};
//		addAllZoo(animals);
		
		
		
//		Cat cat1 = new Cat();
//		addZoo(cat1);
//		
//		Dog dog1 = new Dog();
//		addZoo(dog1);
//		
//		Rabbit rabbit1 = new Rabbit();
//		addZoo(rabbit1);
		
		//Polymorphism
//		Animal animal = new Cat();
//		
//		animal.makeSound();
//		animal.eat();
//		animal.walk();
//	
//		//Type safety Check
//		if (animal instanceof Dog) {
//		Dog dog = (Dog) animal;
//		dog.bite();
//		}else {
//			System.out.println("Appointed Object of animal is not dog");
//		}
//		
		//Down Casting
//		Cat originalCat = (Cat)animal;
//		originalCat.scrach();

		//New Object create
//		Cat cat = new Cat();
//		cat.scrach();
		
		
//		System.out.println("Changed to Rabbit");
//		animal = new Rabbit();
//		animal.makeSound();
//		animal.eat();
//		animal.walk();
//		
//		((Rabbit)animal).jump();
//		
//		System.out.println("Changed to Dog");
//		animal = new Dog();
//		animal.makeSound();
//		animal.eat();
//		animal.walk();
//		((Dog)animal).bite();
//		if (animal instanceof Dog) {
//			System.out.println("Appointed Object of animal is dog");
//			Dog dog = (Dog) animal;
//			dog.bite();
//			}else {
//				System.out.println("Appointed Object of animal is not dog");
//			}
//		
//  		cat.makeSound();
//	    	cat.eat();
//   		cat.walk();		
	}

}
