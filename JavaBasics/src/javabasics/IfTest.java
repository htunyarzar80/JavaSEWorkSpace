package javabasics;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nested if //Vote NRC, Age >=, 
		//not sematics
	    //Worst case scenario-7, invalid
	    Scanner userInput = new Scanner(System.in);
	    System.out.println("Enter Your Fav Number : 1 to 7");
	    int day = userInput.nextInt();
	    userInput.close();

	    if (day ==1)
            System.out.println("Happy Sunday");	
	    else if (day==2)
	         System.out.println("Active Monday");
	    else if (day==3)
             System.out.println("Normal Tueday");
        else if (day==4)
	         System.out.println("Boring Wednesday");
        else if (day==5)
	         System.out.println("Very boring  Thursday");
        else if (day==6)
	         System.out.println("Hopeful Friday");
        else if (day==7)
	         System.out.println(" Drinking Saturaday");
	    
        else 
        	System.out.println("invalid Input");
       
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//		System.out.println("Enter Status of NRC?true /false");
//		boolean nrc = userInput.nextBoolean();
//		System.out.println("Enter Your Age?");
//		int age = userInput.nextInt();
//		userInput.close();
//		
//		if(nrc && age >=18)
//			System.out.println("You can vote");
//		else
//			System.out.println("You cannot vote");
//		
		
		
		
		//nested if
//		if(nrc) {
//			System.out.println(" NRC is checked");
//		if (age>=18) {
//			System.out.println("You can vote");
//		}
//		else   {
//			System.out.println("You cannot vote:Under Age");
//		}
//		}else
//			System.out.println("You cannot vote");
		
		
		//Simple if
//		int x = 10;
//		
//		if (x>10) 
//		
//			System.out.println("X is greater than 10");
//	    
//		else if(x==10) {
//			
//		System.out.println("X is equal to 10");}
//		
//		else { 
//		System.out.println("X is less than 10");
//		}
//		 
//		System.out.println("Out of If");
			
		//If Block
//		if(true) {
//			System.out.println("Boolean -True");
//			System.out.println("Inside If Block");
//		}
		
		
		
		
		

	}

}
