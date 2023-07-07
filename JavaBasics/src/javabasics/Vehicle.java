package javabasics;

public class Vehicle {
	
	static int noOfWeels;
	
	//state, attribute
	
	String color="blue";/*null*/
	int speed=100; /*o*/
	double price=200.56;/*0.0*/
	char gearType='W';
	boolean manual=true;
	
	//Behavior
	void engineStart() {
		System.out.println("Engine is started");
	}
	 void barke () {
		 System.out.println("Engine is stopped");
		 
	 }
	
	
//	static int noOfWeels; //can call only by static blocks
//	
//	//state /attribute
//	String color="Blue";
//	int speed=120;
//	double price=28888;
//	char gearType='W';
//	boolean manual=true;
//	
//	void engineStart() {
//		
//		  System.out.println("Engine is started");
//		
//	}
//	void brake () {
//		
//		
//		  System.out.println("Engine is stopped");
//	}
	
	
	
	

}
