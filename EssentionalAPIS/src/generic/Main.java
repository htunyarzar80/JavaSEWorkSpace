package generic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberBox<Number> numberBox = new NumberBox<>();
		numberBox.add(100);
		System.out.println(numberBox);
		
		NumberBox<Double> doubleBox = new NumberBox<>();
		doubleBox.add(123.33);
		System.out.println(doubleBox);
		
//		NumberBox<String> stringBox = new NumberBox<>(); 
		
//		NumberBox<Student> studentBox = new NumberBox<>();
		
		
		
		
		
//		Box<Integer> integerBox = new Box<>();
//		
//		integerBox.add(100);
//		
//		System.out.println(integerBox);
//		System.out.println(integerBox.get());
//		
//		Box<Double> doubleBox = new Box<>();
//		doubleBox.add(100.445);
//		System.out.println(doubleBox);
//		System.out.println(doubleBox.get());
//		
//		Box<String> stringBox = new Box<>();
//		stringBox.add("apple");
//		System.out.println(stringBox);
//		System.out.println(stringBox.get());
//		
//		Student student = new Student(1011, "MgMg", "Civil");
//		
//		Box<Student> studentBox = new Box<>();
//		studentBox.add(student);
//		
//		System.out.println(studentBox);
//		System.out.println(studentBox.get());
	}

}
