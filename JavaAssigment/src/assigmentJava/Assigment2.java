package assigmentJava;

public class Assigment2 {
	public static void main(String[] args) {
		//All Primitives DataTypes
		//int
		int [] numberArray = {1,2,3};
		System.out.println(numberArray);
		System.out.println("Index 0: "+numberArray [0]);
		System.out.println("Index 1: "+numberArray [1]);	
		System.out.println("Index 2: "+numberArray [2]);
		
		//double
		double [] doubleArray = {1.222,2.233,3.344};
		System.out.println(doubleArray);
		System.out.println("Index 0: "+doubleArray[0]);
		System.out.println("Index 1: "+doubleArray [1]);	
		System.out.println("Index 2: "+doubleArray [2]);
		
		//long 
		long [] longArray = {1000,2000,3000};
		System.out.println(longArray);
		System.out.println("Index 0: "+longArray[0]);
		System.out.println("Index 1: "+longArray [1]);	
		System.out.println("Index 2: "+longArray [2]);
		
		//byte 
		byte [] byteArray = {120,100,110};
		System.out.println(byteArray);
		System.out.println("Index 0: "+byteArray [0]);
		System.out.println("Index 1: "+byteArray [1]);	
		System.out.println("Index 2: "+byteArray [2]);
		
		//short
		short [] shortArray = {240,230,220};
		System.out.println(shortArray);
		System.out.println("Index 0: "+shortArray[0]);
		System.out.println("Index 1: "+shortArray [1]);	
		System.out.println("Index 2: "+shortArray[2]);
		
		//float
		float [] floatArray = {1.0f,2.1f,3.2f};
		System.out.println(floatArray);
		System.out.println("Index 0: "+floatArray[0]);
		System.out.println("Index 1: "+floatArray [1]);	
		System.out.println("Index 2: "+floatArray [2]);
		
		//Boolean
		boolean [] booleanArray = {true,false};
		System.out.println("booleanArray :"+booleanArray[0]);
		
		//char
	
		char [] charArray = {'H','Y','Z'};
		
		System.out.println("charArray:"+ charArray[0]);
	
		//prime number between 200 and 500
		int firstValue =200;
		int lastValue = 500;
		while (firstValue<lastValue) {
			boolean flag = false;
			for (int i =2; i <=firstValue/2;i++) {
			    if (firstValue%i ==0) {
			    	flag = true;
			    	break;
			    }
			}
			if (!flag && firstValue !=0 && firstValue!=1)
				System.out.println(firstValue+"");
			++firstValue;
		}
		
		
		//largest value in an array
		
		int [] numArray = new int [] {12,34,56,60,69};
		int largeValue= numArray[0];
		for (int i = 0;i<numArray.length;i++) {
			if (numArray[i]>largeValue)
				largeValue=numArray[i];
		}
		System.out.println("Largest Value : "+largeValue);

		// factorial of given number
		int num = 12;
		long factorial = 1;
		for (int i =1;i<=num;++i) {
			factorial *=i;
		}
		System.out.println("Facotorial :"+factorial);
		
		//LCM of given two numbers
		int num1= 7;
		int num2= 5;
		int gcd = 1;
		for(int i =1;i<=num1 && i <= num2;i++) {
			if (num1 % i == 0 && num2 % i ==0)
				gcd = i;
			
		}
		
		int lcm =( num1 * num2)/gcd;
		System.out.println("LCM :"+lcm);
		
	}

}
