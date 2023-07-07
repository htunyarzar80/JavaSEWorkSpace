package lambda;

public class GenericLambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomComperator<Double> doubleComparator = 
				(Double op1,Double op2)-> (op1 >=op2)?(op1==op2)?0.0:1:-1;
				
				Double max = doubleComparator.compare(30.0, 25.5) >0?30.0 :25.5;
				
				System.out.println(max);
				
				CustomComperator<String> stringMaxComperator = 
						(s1,s2) -> s1.charAt(0) > s2.charAt(0)? s1 : s2; 
						
						System.out.println(stringMaxComperator.compare("Apple","Mango"));
		
	}

}
