package javabasics;

public class StringTest {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String country = "Myanmar,Japan,Korea, USA";
		
		String[] countryArray = country.split(",");
		
		for (String temp : countryArray)
			System.out.println(temp);
		
		String countryJoined = String.join("*", countryArray);
		System.out.println(countryJoined);
		
		//good practice 
//		String s1 ="world";//jvm intern ()create hello string pool
//		String s2 ="hello";//hello, world -> s1 
//		String s3 =s1;
//		
//		
//		System.out.println("s1:"+s1);
//		System.out.println("s2:"+s2);
//		System.out.println("s3:"+s3);
		
		//==-> type /reference value equal -> true 
//		
//		System.out.println("s1 = s2?:"+(s1 == s2));
//		System.out.println("s3 = s2?:"+(s3== s2));
//		
//		//bad practice 
//		String s4=new String("hello");//JVM intern () heap 
//		String s5=new String("hello");//heap 2 hello object 
//		
//		System.out.println("s1 = s4?:"+(s1== s4));
//		System.out.println("s4 = s5?:"+(s4== s5));
//		
//		//equal () 
//		
//		System.out.println("s1 equal s4?:"+(s1.equals(s4)));
		
		
		

	}

}
