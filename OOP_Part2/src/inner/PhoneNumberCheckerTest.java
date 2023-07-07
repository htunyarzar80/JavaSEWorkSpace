package inner;

public class PhoneNumberCheckerTest {
	
	static void checkPhoneNumber (String phno1, String phno2) {
		
		class PhoneNoChecker{
			
			boolean check(String phno) {
				if (phno.startsWith("09") && phno.length() == 11)
						return true;
				return false;
			}
			
		}
		
		PhoneNoChecker phnoChecker = new PhoneNoChecker();
		
		boolean check1=phnoChecker.check(phno1);
		if (check1) 
			System.out.println("Phno "+phno1 + "is valid");
		else 
			System.out.println("Phno "+phno1 +"is nivalid");
		
		
		boolean check2=phnoChecker.check(phno2);
		if (check2) 
			System.out.println("Phno "+phno2 + "is invalid");
		else
		    System.out.println("Phno "+phno2 +"is nivalid");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkPhoneNumber ("09403348087","03484779");

	}

}
