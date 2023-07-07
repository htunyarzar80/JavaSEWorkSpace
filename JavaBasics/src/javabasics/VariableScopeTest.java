package javabasics;

public class VariableScopeTest {
	
	static int staticVal =2000;//class scope
	
	int instanceVal=5000;
	
	void method1() {
		
		System.out.println("Inside method1:- Var:"+instanceVal);
	}
    void method2() {
		
		System.out.println("Inside method2:- Var:"+instanceVal);
	}
	
	
	public static void main(String[] args) {
		
		int b=0;//local scope
		b=1000;
		System.out.println("b Value : "+b);
		System.out.println("Static Var:"+staticVal);
		test1();
		
		VariableScopeTest mainObj = new VariableScopeTest();
		mainObj.method1();
		mainObj.method2();
		
		
		
//		int a =1000;
//		a=2000;
//		System.out.println("a Value : +a");
		
		
		
	}
	static void  test1() {
		//System.out.println("b Value : "+b);
		System.out.println("Inside Test1 - Static Var:"+staticVal);
		
		
		
	}

}
