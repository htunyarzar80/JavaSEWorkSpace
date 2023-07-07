package com.hostmdy.package1;

public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(-1001,"HeinHein","Ciivl");
//		s1.setId(-1001);
//		s1.setName("Hein");
//		s1.setMajor("IT");
//		
		if (s1.getId() != -1)
			System.out.println("ID :" + s1.getId());
		else
			System.out.println("Id is invalid");
		
		System.out.println("Current Id :"+s1.id);
		
		System.out.println("Name :" + s1.getName());
		System.out.println("Major :" + s1.getMajor());

//		Student s1 = new Stundent(1011,"MgMg","IT");
//		
//		System.out.println("Name :"s1.seeName());
//		s1,getName
//		System.out.println("Name :"s1.seeName());
	}

}
