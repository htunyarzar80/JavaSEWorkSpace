package multi_threading;

public class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	private void process() {
		for(int i = 1; i<=10;i++) {
			System.out.println(Thread.currentThread()+"works process "+i);
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	
	}

}
