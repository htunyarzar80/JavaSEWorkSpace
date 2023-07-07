package javabasics;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxFinder maxFinder = new MaxFinder();
		
		System.out.println("20,30 Max :"+maxFinder.max(20,30));
		System.out.println("4.5, 3.2  Max :"+maxFinder.max(4.5,3.2));
		
		System.out.println("Max Among 3:"+maxFinder.max(40,60,30));
		System.out.println("Max Among 6 : + maxFinder,max(20, 30, 10, 5, 6, 15)");
		
		System.out.println("Short : "+ maxFinder.max((short)20000,(short)40000));
		
		MaxFinder.max();
		
	}

}
