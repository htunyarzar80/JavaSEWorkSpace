package javabasics;

public class OperatorPrecedenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result1 = 10+20-30*4/2;//10+20-60=-30
		int result2 = (10+20-30*4)/2;
		int result3 = (10+20-30)*(4/2);
		int result4 = 10+(20-30*4)/2;//-40
		
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		System.out.println("result3:"+result3);
		System.out.println("result4:"+result4);
		
		
		
		

	}

}
