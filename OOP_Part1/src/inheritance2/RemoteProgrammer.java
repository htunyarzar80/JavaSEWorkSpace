package inheritance2;

import inheritance.EmployeeIT;

public class RemoteProgrammer extends EmployeeIT {
	

	public RemoteProgrammer() {
		// TODO Auto-generated constructor stub
	
		super ("sample");
		name = "TunTun";
		email = "tt@gmail.com";
		salary = 3000.0;
		
		
		writeCode();
		thinkAlogorithm();
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(salary);
		
	}

}
