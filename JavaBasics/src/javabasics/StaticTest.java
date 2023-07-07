package javabasics;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter c1 = new Counter();//count=1
//		System.out.println("Object Count :"+ c1.count);
		
		Counter c2 = new Counter();//count=2
//		System.out.println("Object Count :"+ c2.count);
   	
		Counter c3 = new Counter();//count=3
//		System.out.println("Object Count :"+ c3.count);
		
		Counter c4 = new Counter();//count=4
//		System.out.println("Object Count :"+ c4.count);
		
		System.out.println("Object Total :"+Counter.count);

	}

}
