package javabasics;

public class VarargsTest {
      //test  with array
//	static double add(double [] operands) {
//		
//		double result = 0;
//		for(double operand : operands) {
//			
//			result += operand;
//			
//		}
//		return result;
//	}
	
	static double add(boolean addok,double...operands) {
		
		double result = 0;
		if (addok) {
		for(double operand : operands) {
			
			result += operand;
		}
		}else { 
			System.out.println("This method only support  addition.");
			
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array1 = {10,30,40};
		double [] array2 = {10,3.75};
		double [] array3 = {12.5,30,40};
		double [] array4 = {100.66,39.44,4444,5555,};
//		double [] emptyArray = {};
		
//		System.out.println("Array 1 :"+add(array1));
//		System.out.println("Array 2 :"+add(array2));
//		System.out.println("Array 3 :"+add(array3));
//		System.out.println("Array 4 :"+add(array4));
//        System.out.println("no array :"+add(emptyArray));
		
		System.out.println("4 Args :"+add (true,100, 200,300, 400,500));
		System.out.println("4 Args :"+add (true,100, 200,300, 400));
		System.out.println("3 Args :"+add (true,100, 200,300 ));
		System.out.println("No Arrays :"+add (false));
	}

}
