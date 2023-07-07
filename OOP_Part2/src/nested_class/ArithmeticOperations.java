package nested_class;

import javax.crypto.BadPaddingException;

public class ArithmeticOperations {
	private double operand1;
	private double operand2;
	private char operator;
	
	public ArithmeticOperations() {
		// TODO Auto-generated constructor stub
	}

	public ArithmeticOperations(double operand1, double operand2, char operator) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator = operator;
	}


	 private class Addition{
//		static final String DATA_TYPE ="doulbe";
//		private double op1;
//		private double op2;
//		
//		static void description() {
//			System.out.println("Addition Inner Nested Class");
//		}	
//		public Addition() {
//			System.out.println("Inside no Arg Addition Constructor");
//		}
//		public Addition(double op1, double op2) {
//			super();
//			this.op1 = op1;
//			this.op2 = op2;
		
	 private double add() {
//			if (operand1 ==0.0 && operand2 == 0.0 )
//				return op1 + op2;
//			
			return operand1+operand2;
		}
	}
	

     private class Mutiplication {
		double mutiply() {
			return operand1*operand2;
		}
	}
	
private	class Subtraction{
		double subtract() {
			return operand1-operand2;
			
		}
	}

     private class Dividsion{
		double divide () {
			return operand1 != 0.0? operand1/operand2 : 0.0;
		}
	}
	
     private class Modulo {
		double modulus() {
			return operand1%operand2;
		}
	}

     public double getResult() {
    	return switch (this.operator) {
		case '+' ->new Addition().add();
		case '-' ->new Subtraction().subtract();
		case '/' ->new Dividsion().divide();
		case '*' ->new Mutiplication().mutiply();
		case '%' ->new Modulo().modulus();
		default ->0.0;
    	};
		
}



}
