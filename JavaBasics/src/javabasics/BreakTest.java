package javabasics;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array - search 
		
//		int[] searchedArray= {10,23,40,23,10,};
		
		int [][] searchedArray = {{13,14,15,20},{20,21,15},{22,48,68}};
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Number to Search :");
		int searchedNumber = userInput.nextInt();
		userInput.close();
		
		boolean foundIt =false;
		int index1=0;
		int index2=0;
		int count=0;
		
		search:
		for (int j = 0;j< searchedArray[j].length; j++) {
			
			for (int i = 0;i< searchedArray.length;i++) {
				count++;
				if (searchedNumber ==searchedArray[j][i]) {
					foundIt =true;
					index1=j;
					index2=i;
					break search;
				
			}		
		  }
		}
		
				String result = foundIt? " Found "+ searchedNumber+" at index("+index1 +", "+index2+")":
					searchedNumber +" is not found.";
				System.out.println(result);
				System.out.println("Loop Times :"+count);
			
//		boolean foundIt = false;
//		int index=0;
//		int count=0;
//		
//	    for (int i = 0; i < searchedArray.length; i++) {
//	    	count++;
//	    	
//			if(searchedNumber ==searchedArray[i]) {
//				foundIt = true;
//				index = i;
//				break;
//			}
//			
//		}
//			String result = foundIt? " Found "+ searchedNumber+" at indexn -"+index:
//				searchedNumber +" is not found.";
//			System.out.println(result);
//			System.out.println("Loop Times :"+count);
//				
//			
	         }
         }
		
	

