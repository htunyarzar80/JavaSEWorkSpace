package polymorphism;

public class Cat extends Animal{
	
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
	
	//@Override
	private void antiLifeEquation () {
		System.out.println("Cat fake antilife equation");
		
	}
	
	@Override
	public void storyTeller() {
		// TODO Auto-generated method stub
		System.out.println("long long ago, cat posses antilife equation ");
		System.out.println("But other animals didn't believe.They think");
		antiLifeEquation();
	}
	
	//@Override
//	static void sizeStatus(int pound) {
//		
//	}
	
//	@Override
//	void canControlAnimal() {
//		// TODO Auto-generated method stub
//		System.out.println("Cat Control all Animal Types");
//	}
}
