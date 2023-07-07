package function;

import java.util.function.Function;

public class FunctionChainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Double, Double> onefourth = n -> n/4;
		
		Function<Double, String> x5 = n -> String.valueOf(n*5);
		
//		String result = onefourth.andThen(x5).apply(150.0);
		
		String result = x5.compose(onefourth).apply(400.0);
		
		System.out.println("Result :"+result);
		
		Function<Integer, Integer> integerIdentity = Function.identity();
		
		System.out.println("Identity :"+integerIdentity.apply(1000));
		
	}

}
