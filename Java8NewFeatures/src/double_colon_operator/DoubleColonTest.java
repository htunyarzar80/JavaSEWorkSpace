package double_colon_operator;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import lambda.OneArgCaculator;
import lambda.Printer;

class SuperDuper{
	
	double add(double op1,double op2) {
		return op1+op2;
	}
	
	boolean isEven (int num) {
		return num%2==0?true : false ;
	}
	
}

public class DoubleColonTest extends SuperDuper {

	public DoubleColonTest() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside DoubleColonTest Constructor");
		
	}
	
	static void print() {
		System.out.println("This is a print method");
	}
	
	
	double triple (double op1) {
		return op1 * op1 * op1 ;
	}
	
	
	double add(double op1, double op2 ) {
		
		BinaryOperator<Double> add = super :: add;
		return add.apply(op1, op2);
	}
	
	boolean isEven(int num) {
		Predicate<Integer> even = super :: isEven;
		return even.test(num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     	DoubleColonTest dct = new DoubleColonTest();
     	
     	System.out.println("add :"+dct.add(40,60));
     	
     	System.out.println("even :"+dct.isEven(10));
     	
     	Printer constRef = DoubleColonTest :: new;
     	
     	constRef.print();
     	
//		
//		Function<Double , Double> triple = dct :: triple;
//		
//		double result = triple.apply(25.0);
//		System.out.println("Result :"+result);
		
//		Printer println = DoubleColonTest :: print;
//		println.print();
//		
//		OneArgCaculator sqroot = Math :: sqrt;
//		System.out.println("Sqroot : "+sqroot.calculate(25));
		
		

	}

}
