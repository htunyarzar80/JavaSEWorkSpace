package javabasics;

public class Assigment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Area of Trapezium =1/2(a+b)h
		
		int baseA=12;
		int baseB=60;
		int heightH=2;
		int area = ((baseA + baseB)/2)*heightH;
		
	    System.out.println("Area of Trapezium= "+area);
	    
	    //Area of Triangle = 1/2(Base * Height)
	    
	    int baseC=10;
	    int heightD=20;
	    int area1= (baseC+heightD)/2;
	    
	    System.out.println("Area of Triangle="+area1);
	    
	    //Swapping two variable Values
	    
	    int a =10;
	    int b=5;
	    a=a+b;//a=15
	    b=a-b;// b=10
	    a=a-b;//a=5
	    System.out.println("After Swapping:\na="+a+"\nb="+b);
	    
		// long -> char (Special Casting )
		
		long longVal1=12000L;
		char charVal1=(char)longVal1;
		
		System.out.println(longVal1);
		System.out.println(charVal1);
		
		//double -> char 
		
		
		//char -> double (16 bits -> 64 bits) Special Case 
		
		char smallA='a';
		double doubleVal1=smallA;
		
		System.out.println(smallA);
		System.out.println(doubleVal1);
		
		//double -> char  (64 bits -> 16 bits) Special Case
		
		double doubleVal2 =200.565;
		char charVal2 = (char)doubleVal2;
		
		System.out.println(doubleVal2);
		System.out.println(charVal2);
		 
		//Comparing 2 char which is more small
		
		char capB= 'B';
		char smallB='b';
		boolean result3 = capB < smallB;
		System.out.println("Result 3 :"+ result3);
		
		//Comparing two boolean which is not equal
		
		boolean flag1=true;
		boolean flag2= false;
		boolean result4 = flag1 != flag2;
		System.out.println("Result 4 :"+ result4);
		
		//All arithmetic variable
		
		int x=30;
		int y=20;
		int result5=x+y;
		int result6=x-y;
		int result7=x*y;
		int result8=x/y;
		int result9=x%y;
		
		System.out.println("result5:"+ (x+y));
		System.out.println( "result6:"+ (x-y));
		System.out.println("result7:"+ (x*y));
		System.out.println("result8:"+ (x/y));
		System.out.println("result9:" + (x%y));
		System.out.println( x++);
		System.out.println( ++x);
		System.out.println( --y);
		System.out.println( y--);
		   
	}

}
