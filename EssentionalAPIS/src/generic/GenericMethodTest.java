package generic;

public class GenericMethodTest {
	
	static <T extends Comparable<T>> T max (T t1, T t2, T t3, T t4) {
		T max = t1;
		
		//compare return - -1-positive 0-neutral -1 negative
		if (t2.compareTo(max) > 0)
			max = t2;
		if (t3.compareTo(max) > 0)
			max = t3;
		if (t4.compareTo(max) > 0)
			max = t4;
		return max;
		
	}
	
	static <E> void printArray (E[]array) {
		
		for(final E element : array )
			System.out.print(element +" ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("Max Value of 30,40,20,10 is %d%n",max(30, 40, 20, 10));
		
		System.out.printf("Max Value of apple , Banana , Papaya ,kiwi is %s%n",max("Apple", "Banana", "Papaya", "Kiwi"));
		
		System.out.printf("Max Value of 1.2, 2.3 , 3.6 ,7.5 is %f%n",max(1.2, 2.3, 3.6, 7.5));

		Student s1 = new Student(1011, "MgMg", "IT");
		Student s2 = new Student(1012, "SuSu", "MB");
		Student s3 = new Student(1010, "Toe", "Archi");
		Student s4 = new Student(1016, "Nyi", "MC");
		
		System.out.printf("Max Value of s1,s2,s3,s4 is %s%n",max(s1, s2, s3, s4));
		
//		Integer [] intArray = {10,30,40};
//		
//		Character[] characterArray = {'A','B','C','D'};
//				
//		Student s1 = new Student(1011, "MgMg", "IT");
//		Student s2 = new Student(1012, "SuSu", "MB");
//		Student s3 = new Student(1010, "Toe", "Archi");
//		
//		Student [] studentArray = {s1,s2,s3};
//		
//		String[] stringArray = {"Apple","Mango","Lemon"};
//		
//		printArray(intArray);
//		printArray(characterArray);
//		printArray(stringArray);
//		printArray(studentArray);

	}

}
