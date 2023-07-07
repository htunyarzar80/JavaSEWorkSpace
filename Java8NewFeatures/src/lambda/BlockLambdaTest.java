package lambda;

public class BlockLambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tester leapYearTest = (y)-> {
			boolean leapYearOk= false;
			
			if (y%400 ==0 || (y%4==0 && y%100 !=0 )){
				return true;
				
		}else {
			return false;
		}
			
		};
		
		System.out.println("2024 is leapYear?"+leapYearTest.test(2024));
		System.out.println("2023 is leapYear?"+leapYearTest.test(2023));
		
		
//		Tester factorialTest = (n)-> {
//			boolean factorial10X = false;
//			
//			if (n >20) {
//				System.out.println("Factorial can't be done ");
//			}
//			else {
//				System.out.println("Factorial can be done : "+n);
//				
//				long result = 1L;
//				
//				for (long i=1L; i <= n; i++)
//					result *=i;
//				
//				System.out.println("Factorial of "+n+" is "+result);
//				factorial10X = true;
//				
//			}
//			
//			return factorial10X;
//		};
//		
//		factorialTest.test(30);
//		factorialTest.test(21);
	}

}
