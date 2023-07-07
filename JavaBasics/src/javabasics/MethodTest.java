package javabasics;

public class MethodTest {
	
	static int staticVal = 10000;
	int instanceVal =50000;
	
	static void greeting() {
		System.out.println("Hello HYZ");
	}
	//calculate result -> no modify
	static void greetingWithName(String name) {
		System.out.println("Hello Mr."+name);
	}
	
	
	//constant result
	static String greetingWord() {
		return "Hello";
	}


		static double add(double op1, double op2) {
			
			double result = op1 + op2;
			return result;
			
		}
		//instant Method
		double mutiply(double op1, double op2) {
			System.out.println("StaticVal:"+staticVal);
			System.out.println("Instance :"+instanceVal);
			System.out.println("Result :"+add(30,50));
			method1();
			return op1*op2;
		}
		
		void method1( ) {
			System.out.println("Inside Method1");
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			MethodTest methodTest = new MethodTest();
			double result = methodTest.mutiply(20, 30);
			System.out.println(result);
		
			
//			System.out.println(instanceVal);
//			multiply(20,30);
			
//			System.out.println(staticVal);
			
			
			
			
			
//		System.out.println("20+30="+add (20,30));
//		double result=add (45.6,55.8);
//		
//		double result5X =add(40,50)*5;
//		
//		System.out.println(result);
//		System.out.println(result5X);
		
		
		
//		String greeting =greetingWord();//Hello
//		System.out.println(greeting +" everyone ");
		
	//	greetingWithName("MgZaw");
//		
//		String name = "Nyo Nyo";
//		greetingWithName(name);
//		
//		greetingWithName("MgNyein");
//		
//		greetingWithName("MgHtun");
		
		
		
//		greeting();//method invocation 
//		greeting();
//		greeting();
//		greeting();
//		greeting();

	}

}
