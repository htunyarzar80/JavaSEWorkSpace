package multi_threading;

public class MyDemoThreading extends Thread {
	
	@Override
	public void run() {
		
		process();
	}
	 
	private void process() {
		for(int i = 1; i<=10;i++) {
			System.out.println(Thread.currentThread()+"works process "+i);
			
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
