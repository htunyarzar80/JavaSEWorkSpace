package javabasics;

public class MaxFinder {
	
	
	int max(int op1, int op2) {
		System.out.println("Inside 2 parameter Integer ");
		return op1>op2 ? op1 :op2;
		
	}

	int max(short op1, short op2) {
		System.out.println("Inside 2 parameter short ");
		return op1>op2 ? op1 :op2;
	
	} 
	double max(double op1, double op2) {
		System.out.println("Inside 2 parameter Double ");
		return op1>op2 ? op1 :op2;
		
	}
	
	
	int max(int op1, int op2, int op3) {
		System.out.println("Inside 3 parameter Integer ");
		
		int max=op1;
		
		if (op2>max)
			max=op2;
		
		if (op3>max)
			max=op3;
		
		
		return max;
		
	}
	static void max() {
		System.out.println("This is to find max value");
	}

	int max(int... operands) {
		System.out.println("inside varargs max methods");
		int max = 0;
		
		for (int operand :operands) {
			if (operand > max) {
				max =operand;
			}
			
		}
		return max;
		
	}
}
