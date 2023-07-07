package javabasics;

public class RefrenceVsValueType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		addOne(x);
		System.out.println("x :"+x);
		
	}

	static void addOne(int x) {
		x++;
		
		int []numArray = {10,20,40,50,30};
		addArrayOne(numArray);
		printArray(numArray);
		
	}
	
	static void addArrayOne(int [] numArray) {
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] +=1;
			
		}	
	}
	
	static void printArray(int [] array) {
		for (int element : array)
			System.out.print(element +"");
		System.out.println();
	}
}
