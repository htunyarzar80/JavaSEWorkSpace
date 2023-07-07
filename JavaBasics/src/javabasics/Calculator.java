package javabasics;

public class Calculator {

	double add(double op1, double op2) {
		return op1+op2;
	}
	
	double subtract(double op1, double op2) {
		return op1-op2;
	}
	double mutiply(double op1, double op2) {
		return op1*op2;
	}
	double divide(double op1, double op2) {
		return op2 !=0?op1/op2:0;
	}
	
	double modulus(double op1, double op2) {
		return op1%op2;
	}
	
	static double getPIValue() {
		return 3.42;
	}
}
