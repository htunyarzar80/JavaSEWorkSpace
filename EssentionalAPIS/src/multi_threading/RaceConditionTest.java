package multi_threading;

public class RaceConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount = new BankAccount();
		
		Thread mgmg = new Thread(bankAccount);
		mgmg.setName("MgMg");
		
		Thread mamya = new Thread(bankAccount);
		mamya.setName("MaMya");
		
		mamya.setPriority(10);
		mgmg.setPriority(2);
		
		mgmg.start();
		mamya.start();

	}

}
