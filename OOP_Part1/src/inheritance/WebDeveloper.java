package inheritance;

public class WebDeveloper extends Developer {
	
	int testVar = 50000;
	
	public WebDeveloper(String arg) {
		super(arg);
		System.out.println("Inside WebDeveloper one Args constructor");
	}
		
	public WebDeveloper() {
		// TODO Auto-generated constructor stub
		super ("sample");
		System.out.println("Inside WebDeveloper No Args Constructor");
//		System.out.println("Without Super :"+testVar);
//		System.out.println("With Super :"+super.testVar);
		System.out.println("WwbDeveloper object :"+this);
	}
	void createWebApp() {
		System.out.println("Webdeveloper is creating WebApp");
	}

}
