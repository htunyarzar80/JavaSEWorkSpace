package javabasics;

public class AutoBoxingUnBoxingBenefits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		double op1=30;
//		double op2=50;
//		double result1 =add(op1,op2);
//		System.out.println("result :"+result1);

//		Double op1=30.8;
//		Double op2=50.7;
//		Double result1 =add(op1,op2);// Auto Unboxing Auto Boxing	
//		System.out.println("result :"+result1);
		
		double op1=30;
		double op2=50;
		double result1 =multiply(op1,op2);
		
		System.out.println("result :"+result1);
	}

	static double add (double op1,double op2) {
		return op1+op2;
	}
	static Double multiply (Double op1, Double op2) {
		return op1*op2;
	}
}
