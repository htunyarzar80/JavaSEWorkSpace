package predicate;

import java.util.function.Predicate;

public class ChainPredicate {

	static void and() {
		Predicate<String> shortSentence = s -> s.length() <30;
		Predicate<String> endWithdot = s -> s.endsWith(".");
		
		boolean result1 = shortSentence.and(endWithdot).test("My name is KyawGyi.");
		System.out.println("ValidShortSent : "+result1);
		
		boolean result2 = shortSentence.and(endWithdot).test("My name is KyawGyi ");
		System.out.println("ValidShortSent : "+result2);
		
		boolean result3 = shortSentence.and(endWithdot).test("My name is KyawGyi.My name is KyawGyi.My name is KyawGyi. ");
		System.out.println("ValidShortSent : "+result3);
		
		boolean result8 = shortSentence.and(endWithdot).negate().test("My name is KyawGyi.");
		System.out.println("InvalidShortSent : "+result8);
		
	}
	
	static void or() {
		Predicate<String> mr = s -> s.startsWith("Mr");
		Predicate<String> mrs = s -> s.startsWith("Mrs");
		
		boolean result4 = mr.or(mrs).test("Mr.HeinKo");
		System.out.println("Polite Form : "+result4);
		
		boolean result5 = mr.or(mrs).test("Mrs.HeinKo");
		System.out.println("Polite Form : "+result5);
		
		
		boolean result6 = mr.or(mrs).test("HeinKo");
		System.out.println("Polite Form : "+result6);
		
		
	}
	
	static void negate() {
		Predicate<Boolean> rain = bool -> bool;
		
		boolean result7=rain.negate().test(true);
		System.out.println("My Predicition :"+ result7);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		and();
//		or();
//		negate();
		

	}

}
