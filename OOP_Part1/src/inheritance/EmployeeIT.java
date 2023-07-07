package inheritance;

public /*final*/ class EmployeeIT {
	
	protected String name;
	protected String email;
	protected Double salary;
	private String employeeScrete = "AFG - 234";

	//prevent inheritance and instanti
//	private EmployeeIT() 
		public EmployeeIT(String arg) {
		System.out.println("Inside EmployeeIT one Arg constructor");
	}
//	
//	public EmployeeIT() {
//		// TODO Auto-generated constructor stub
//		System.out.println("Inside EmployeeIT No Args Constructor");
//		System.out.println("EmployeeIT object :"+this);
//	}
//	
	public String getEmployeeScrete() {
		return employeeScrete;
	}

	public void setEmployeeScrete(String employeeScrete) {
		this.employeeScrete = employeeScrete;
	}

	protected void writeCode () {
		System.out.println("EmployeeIT is writing Code");
	}

	protected void thinkAlogorithm() {
		System.out.println("EmployeeIt thinks algoritms");
	}
}
           
           