package object_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1001,"MgMg","Civil");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(Integer.toHexString(s1.hashCode()));
		System.out.println(s1.getClass());

		Student s2 = new Student(1002,"MaSapal","IT");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println(Integer.toHexString(s2.hashCode()));
		System.out.println(s2.getClass());

		Student s3 = new Student(1001,"MaSapal","EC");
		System.out.println(s3);
		System.out.println(s3.hashCode());
		System.out.println(Integer.toHexString(s3.hashCode()));
		System.out.println(s3.getClass()); 
		
		System.out.println("s1.equal(s3)"+s1.equals(s3));
		
		Student s4 = new Student(1001,"Hein","Archi");
		System.out.println(s4);
		System.out.println(s4.hashCode());
		System.out.println(Integer.toHexString(s4.hashCode()));
		System.out.println(s4.getClass());

		Student empty1 = new Student();
		Student empty2 = new Student();
		System.out.println("Empty test : "+empty1.equals(empty2));
		
		
//		System.out.println(s1.toString());
		
//		System.out.println(Integer.toHexString(s1.hashCode()));

		
	}

}
