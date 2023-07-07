package lambda;

@FunctionalInterface
public interface Printer {

	void print();
	
	static void description() {
		System.out.println("This is Printer Funtional Interface");
	}
	
}
