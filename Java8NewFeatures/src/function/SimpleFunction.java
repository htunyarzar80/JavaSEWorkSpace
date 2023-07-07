package function;

import java.util.function.Function;

public class SimpleFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Double,String> square = n -> String.valueOf(n*n) ;
		
		String result = square.apply(22.5);
		System.out.println("Square :"+result);
		
		Function<String, Character> initialLetter = s->s.charAt(0);
		char initialChar = initialLetter.apply("Aeroplane");
		System.out.println("InitialLetter :"+initialChar);
		
		Function<Double, Double> sqroot = n -> Math.sqrt(n);
		double result1 = sqroot.apply(2500.0);
		System.out.println("Sqroot :"+result1);
		

	}

}
