package multi_threading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDemoThreading thread1= new MyDemoThreading();
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.setName("demoThread1");
		thread1.start();
		System.out.println("Thread1 is alive? :"+thread1.isAlive());
		try {
			thread1.join();
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		Task task1 = new Task();
		
		Thread thread3= new Thread(task1);
		thread3.setName("thread3");
		thread3.start();
		
		MyDemoThreading thread2 = new MyDemoThreading();
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread2.setName("demoThread2");
		thread2.start();
		
		Thread thread4= new Thread(task1);
		thread4.setName("thread4");
		thread4.start();
		System.out.println("Thread4 is alive? :"+thread4.isAlive());
		try {
			thread4.join();
			thread4.isAlive();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			
			
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread()+" is working ");
		
		
	}

}
