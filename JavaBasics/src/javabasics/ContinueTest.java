package javabasics;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//contain()
		
		
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter String to Search :");
		String searchedString = userInput.nextLine();
		userInput.close();
		
		String testString = "Call me crazy.The day you want away.hahaha hoaho";
		
		boolean foundIt = false;
		int maxLength = testString.length() - searchedString.length();
		
		search:
		for (int i = 0; i <=maxLength ; i++) {
 			
			int n = searchedString.length();
			int j = i;
			int k = 0;
			
			while(n-- != 0) {
				
				if(testString.charAt(j++) != searchedString.charAt(k++)) {
					continue search;
				}
				
			}
			foundIt = true;
			break search;
			
		}
		
		String result = foundIt? "\""+searchedString+"\"is found" :"\""+searchedString+"\"is not found";
		System.out.println(result);
		
		
		
		
//		
//		String searchedString ="Pine apple apple pine";
//		
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("Enter Number to Search :");
//		char searchedChar = userInput.next().charAt(0);
//		userInput.close();
//		
//		int countChar =0;
//		int countLoop =0;
//		
//		for (int i = 0; i < searchedString.length(); i++) {
//			if(searchedString.charAt(i)!= searchedChar) {
//				continue;
//				
//			}
//			countChar++;
//			countLoop++;
//		}
//		
//		System.out.println(searchedChar+ " is found "+countChar+"times");
//		System.out.println("Loop "+countLoop+"times");
		

	}

}
