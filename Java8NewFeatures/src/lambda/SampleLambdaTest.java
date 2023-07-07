package lambda;

import java.util.Iterator;

public class SampleLambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator addition = (op1,op2) -> op1+op2;
		Calculator subtraction = (op1,op2) -> op1-op2;
		Calculator mutiply = (op1,op2) -> op1*op2;
		Calculator divide = (op1,op2) -> (op2 !=0 )? op1/op2:0.0;
		Calculator modulus = (op1,op2) -> op1%op2;
		
		System.out.println(addition.calculate(30,20));
		System.out.println(subtraction.calculate(30,20));
		System.out.println(mutiply.calculate(30,20));
		System.out.println(divide.calculate(30,20));
		System.out.println(modulus.calculate(30,20));
		
//		OneArgCaculator square = a -> a*a; //evalute double
//		System.out.println(square.calculate(50));
//		
//		OneArgCaculator sqroot = op1-> Math.sqrt(op1);
//        double result = sqroot.calculate(25);
//        System.out.println(result);
//        
//        System.out.println(sqroot.int5x(10));
		
		
		///zero Lambda
//		Printer noLinePrinter = ()-> System.out.print("This is zero no Line lambda ");
//		noLinePrinter.print();
//		
//		
//		Printer linePrinter = ()-> System.out.println("This is Line Zero Lambda");
//		linePrinter.print();
//		
//		Printer formatLambda = ()-> System.out.printf("%s:%s","Inform","This is Format Zero Lambda");
//		formatLambda.print();
		
//		Printer.description();
		
		
		
	}

}
