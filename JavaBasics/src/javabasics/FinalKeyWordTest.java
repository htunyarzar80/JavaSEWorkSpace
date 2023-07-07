package javabasics;

import javax.naming.AuthenticationException;
import javax.naming.AuthenticationNotSupportedException;

public class FinalKeyWordTest {
	
	static final String WORLD_BIGGEST_COUNTRY ="Russia";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WORLD_BIGGEST_COUNTRY="China";
//		System.out.println(WORLD_BIGGEST_COUNTRY);
//
//		final int number = 2000;//constant
//		System.out.println(number);
		
//		Authentication authentication = FakeDatabase.authenticate("mgmg","1234");
//		
//		final Authentication authentication = FakeDatabase.authenticate("hackzoe","1001");
//		
//		System.out.println(authentication.getToken());
//		System.out.println(authentication.getSecurityKey());
//		
//		authentication.setSecurityKey("new Key");
//		authentication.setToken("new Token");
//		
//		System.out.println(authentication.getToken());
//		System.out.println(authentication.getSecurityKey());
//		
		int[]array1 = {10,20,30,40}; //abundunt
//		array1 = new int[5];
		array1[0]=50;
		array1[1]=60;
		array1[2]=70;
		array1[3]=80;
		
		
		for(int element : array1) {
			System.out.print(element+ " ");
		}
		
		
//		 Authentication  fakeauthenticate = new Authentication("hackzoe","hackzoe");
//		 authentication = fakeauthenticate;
		 
		
//		if (authentication != null)
//			System.out.println("Login Sucessfully");
//		else 
//			System.out.println("Login Fail : Username or Password is incorrect");
		
	}

}
