package inheritance;

public class Developer extends EmployeeIT{
	String developerCode;
	int testVar = 10000;
	
	public Developer(String arg) {
		super(arg);
		System.out.println("Inside Developer one Arg constructor");
	}
	
//	public Developer() {
//		/*
//		 * // TODO Auto-generated constructor stub super();
//		 */ //invoke EmployeeIT Default Constructor
////		System.out.println("Inside Developer No Args Constructor");
////		System.out.println("Developer object :"+this);
//	}
	
	void createClassDesigns() {
		System.out.println("Developer is creating classdesigns");
	}



}
