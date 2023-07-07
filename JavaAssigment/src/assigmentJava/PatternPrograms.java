package assigmentJava;

import java.util.Scanner;

public class PatternPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your pattern :Number");
	    int pattern = userInput.nextInt();
	    userInput.close();

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

//	    
//		for(int i=1;i<=pattern;i++) { 
//			//space loop
//			for(int j =pattern-1;j>=i;j--) {
//			System.out.print(" ");
//			}
//		//star loop
//		for(int k=1;k<=i; k++) {
//			System.out.print(k+" ");
//		}
//		
//		System.out.println();
//	}


//		for(int i=pattern;i>= 1;i--) { 
//			//space loop
//			for(int j =pattern-1;j>=i;j--) {
//			System.out.print(" ");
//			}
//		//star loop
//		for(int k=i;k>=1; k--) {
//			System.out.print(k+" ");
//		}
//		
//		System.out.println();
//	}

	    for (int i =1; i<=4;i++) {
	    	for (int j=1;j<=pattern;j++) {
	    		if (i%2==1) {
	    			System.out.print(j);
	    			
	    		}
	    		else {
	    			System.out.print(pattern-j+1);
	    	}
	    		
	    }
		  System.out.println();
	    	
	    }
		
//	    for (int i = 1; i<= 4;i++) {
//	    	for (int j=1;j<=pattern;j++) {
//	    		if (i<=j) {
//	    			System.out.print(i);
//	    			
//	    		}
//	    		else {
//	    			System.out.print(" ");
//	    	}
//	    		
//	    }
//		  System.out.println();
//	    	
//	    }
//	    for (int i =1; i<=4;i++) {
//	    	for (int j=1;j<=pattern;j++) {
//	    		if (j==pattern - i+1) {
//	    			System.out.print("*");
//	    			
//	    		}
//	    		else {
//	    			System.out.print(j);
//	    	}
//	    		
//	    }
//		  System.out.println();
//	    	
//	    }
	}
	
}
		
	


