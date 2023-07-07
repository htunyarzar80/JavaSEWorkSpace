package generic;

public class WildCardTest {

	// fix - Integer box

	static void boxIdentifier(Box<?> box) {
		
		System.out.println(box.get().getClass());
	}
	
	static void boxNumber5XIdentifier(Box<? extends Number> box) {
		
		Number number = box.get();
		Object classType = box.get().getClass();
		
		if (classType.toString().contains("Integer"))
		System.out.println(number.intValue()*5);
		
		if (classType.toString().contains("Double"))
			System.out.println(number.doubleValue()*5);
		
		System.out.println();
	}
	
	static void boxDoubleIndentifier(Box<? super Double> box) {
		System.out.println("This box is double box ");
		
	}

	//don't do that
//	static void boxIdentifier(Box<Object> box) {
//
//		System.out.println(box.get().getClass());
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<Integer> integerBox = new Box<>();
		integerBox.add(100);
		boxIdentifier(integerBox);
		boxNumber5XIdentifier(integerBox);
//		boxDoubleIndentifier(integerBox);
		
//		if (integerBox.get()instanceof Integer) {
//		int value = ((Integer) integerBox.get()).intValue();
//		System.out.println(value);
		
		Box<Double> doubleBox = new Box<>();
		doubleBox.add(100.555);
		boxIdentifier(doubleBox);
		boxNumber5XIdentifier(doubleBox);
		boxNumber5XIdentifier(doubleBox);
		
		Box<String> stringBox = new Box<>();
		stringBox.add("Orange");
		boxIdentifier(stringBox);
//		boxNumber5XIdentifier(stringBox);
		
		Student s1 = new Student(1011, "Aung", "IT");
		
		Box<Student> studentBox = new Box<>();
		studentBox.add(s1);
		boxIdentifier(studentBox);
//		boxNumber5XIdentifier(studentBox);
		
	

	}
	}

		
		


