package javabasics;

public class TypePromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//bad practice 
		int a =1000;
		double b = 2.2;
		
		System.out.println("a x b =:"+(a*b));
		
		//good practice
		 
		double c =1000;
		double d = 2.2;
		int result =(int)(c*d);
		
		System.out.println("c x d =:"+result);
		
		
		
		
		
		
	}

}
