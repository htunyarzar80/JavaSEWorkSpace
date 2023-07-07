package javabasics;

import java.util.Scanner;

public class TriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your pattern :Number");
	    int pattern = userInput.nextInt();
	    userInput.close();
	    
//			for(int i=pattern;i>=1;i--) { 
//				//space loop
//				for(int j = pattern-1;j>=i;j--) {
//				System.out.print(" ");
//				}
//			//star loop
//			for(int k=1;k<=i; k++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}

//		for(int i=pattern;i>=1;i--) { 
//			//space loop
//			for(int j = pattern-1;j>=i;j--) {
//			System.out.print(" ");
//			}
//		//star loop
//		for(int k=1;k<=i; k++) {
//			System.out.print(i+" ");
//		}
//		
//		System.out.println();
//	}

		for(int i=pattern;i>=1;i--) { 
			//space loop
			for(int j = pattern-1;j>=i;j--) {
			System.out.print(" ");
			}
		//star loop
		for(int k=1;k<=i; k++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
	}

	}

}
