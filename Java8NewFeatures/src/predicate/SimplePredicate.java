package predicate;

import java.util.function.Predicate;

public class SimplePredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Impreative style
		
//		Predicate<Integer> even= new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer t) {
//				// TODO Auto-generated method stub
//				return t%2==0;
//			}
//		};
//		
//		boolean evenOk = even.test(30);
//		System.out.println("Is even? :"+evenOk);
		
		Predicate<Integer> even = n -> n%2 ==0;//conclse
		boolean evenOk = even.test(25);
		System.out.println("Is even? :"+evenOk);
		
		//declaretive Style
		Predicate<Integer> greaterthan20 = n -> n> 20;
		boolean predictResult = greaterthan20.test(30);
		System.out.println("Predict Result1 : "+predictResult);
		System.out.println("Predict Result2 :"+greaterthan20.test(15));
		
		Predicate<String> containO = s -> s.contains("O");
		System.out.println("Contain-O: "+containO.test("Orange"));
		System.out.println("Contain-O: "+containO.test("apple"));

		
		
	}

}
