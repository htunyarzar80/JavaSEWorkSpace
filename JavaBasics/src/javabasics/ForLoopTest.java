package javabasics;

import java.util.Scanner;

public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find prime number - primeNumber = divided by self, 1
		//eg; 5/5=1
		//Algorithm
		//Step 1 - userInput
		//step 2 - count = 2 / 10 - divided time count+ 1 for loop & if
//		
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("Enter Your Number : Prime");
//		int number = userInput.nextInt();
//     	userInput.close();
//     	
  //      int count = 0;
		
//		for(int i = 1; i <= number;i++) {
//			if (number%1 ==0) {
//				count++;
//			}
//			
//		}
//		
//		String result = (count ==2)? "This number ="+number+"is a prime number":
//			"This number = "+number+"is not a prime number";
//		System.out.println(result);
        
		
		//Nested loop 0uterMostloop InnerLoop
		
		/*
		 *    *****
		 *    *****
		 *    *****
		 *    *****
		 *    *****
		 * */
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Your Pattern : Number");
		int pattern = userInput.nextInt();
		userInput.close();

//		for (int j = 1; j <= pattern; j++) {
//
//			// 1 * row
//			for (int i = 1; i <= 5; i++) {
//				System.out.print("*");
//			}
//
//			System.out.println();
//		}
		
		
//		int []numArray = {20,30,40,50,60};
//		int result =0;
//        
//		// Enhanced for loop 
//		
//		for(int number : numArray ) {
//		   result += number;
//	
		
		
		
		
		
		
		
//	  	for (int i = 0; i < numArray.length;i++) {
//			result+= numArray[i ];
//		}
//		
//		System.out.println("Total Sum :"+ result);
			
		
		
		//Infinity loop scam
		
//		for(;;) {
//			System.out.println("Sample Statement 1");
//			System.out.println("Sample Statement 2");
//		}
		
		
		
		//10 to 10000
		// int i =10;
		for(int i =10 ; i <= 10000; i+=10) {
		
			System.out.println("Value :"+i);

		
		}
	}
}
//		for(int i =1;i<=1500;++i) {
//			System.out.println("I Love You"+i);
//
//	}
//
//		for(int i =5;++i<=13;System.out.println(--i),i+=2) {
//			System.out.println(i++);
			
			
	//	}
	

 
