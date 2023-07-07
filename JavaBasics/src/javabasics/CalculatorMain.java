package javabasics;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Calculator.getPIValue());
		
		Calculator calculator = new Calculator();
		
		double op1= 40.5;
		double op2 = 20.0;
		System.out.println("Add :"+ calculator.add(op1, op2));
		System.out.println("Subtract  :"+ calculator.subtract(op1, op2));
		System.out.println("Mutiply :"+ calculator.mutiply(op1, op2));
		System.out.println("Divide :"+ calculator.divide(op1, op2));
		System.out.println("Modulus :"+ calculator.modulus(op1, op2));
		
		System.out.println("Calculator call PIValue :"+calculator.getPIValue());
		
		

	}

}
