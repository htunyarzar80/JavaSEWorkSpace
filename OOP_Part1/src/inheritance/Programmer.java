package inheritance;

public class Programmer extends EmployeeIT {
	
	public Programmer(String arg) {
		super(arg);
		// TODO Auto-generated constructor stub
	}

	protected String programmerCode;
	
	protected void testProject() {
		System.out.println("Programmer is testing projects");
	}

}
