package javabasics;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
	    System.out.println("Enter Your Fav Name : MgMg");
	    String name = userInput.next();
	    userInput.close();
	    
	    //Verbose - long Form
//	    
//	    String result = switch (day) {
//		case 1,2,3,4,5: {
//			
//			yield "Weekdays";
//		}
//		
//		case 6,7:{
//			yield "Weekends";
//		}
//		default:{
//			yield "Invalid Input";
//		}
//			
//		};
//	    
	    //new switch labeled expression 
	    
//	    String result = switch (day) {
//		case 1,2,3,4,5 ->{
//			System.out.println("Day Number -"+ day);
//			yield "weekdays";
//				
//		}
//		case 6,7 ->{
//			System.out.println("Day Number -"+ day);
//			yield "Weekends";
//		}
//		default -> { 
//			
//			System.out.println("Underfined Day Number");
//		yield "Invalid day"; 
//		
//		
//		}
//		};
	   
		//String Switch
		
		String result = switch (name) {
		case  "MgMg": {
			yield "TG Players";
		}
		
		
		
		default :
		
		yield "Invalid Input";

		
		};
		System.out.println(result);
		
	    //new switch labeled expression
	    
//	    String result= switch (day) {
//		case 1 -> "Monday";
//		case 2 -> "Thuesday";
//		case 3 -> "Wednesday";
//		case 4 -> "Thursday";
//		case 5 -> "Friday";
//		case 6 -> "Saturaday";
//		case 7 -> "Sunday";
//		
//		
//		default ->"Invalid Input";
//		
//		};
	    
//		System.out.println(result);
	    
	    
	    
	    //grouping caseLabel
//	    switch (day) {
//		case 1: case 2: case 3: case 4: case 5:
//			System.out.println("Weekdays");
//			break;
//		case 6:case 7:
//			System.out.println("weekends");
//		break;
//		default;
//		System.out.println("Invalid input");
//			break;
//		
//		};
	    
	    
	    
	    
	    //fallthrough
	    //Worst case scenario without all  break
//	    switch (day) {
//		   case 1: 
//			   System.out.println("Sunday");
//	          // break;
//		   case 2: 
//			   System.out.println("Monday");
//	           //break;
//		   case 3: 
//			   System.out.println("Tuesday");
//	           //break;
//		   case 4: 
//			   System.out.println("Wednesday");
//	           //break;
//		   case 5: 
//			   System.out.println("Thursday");
//	           //break;
//		   case 6: 
//			   System.out.println("Friday");
//	          // break;
//		   case 7: 
//			   System.out.println("Saturaday");
//	           //break;
//		
//		   default: 
//			   System.out.println("Invalid Input");
//		      // break;
//		}
//	   
	   //old Switch
	   
//	   switch (day) {
//	   case 1: 
//		   System.out.println("Sunday");
//           break;
//	   case 2: 
//		   System.out.println("Monday");
//           break;
//	   case 3: 
//		   System.out.println("Tuesday");
//           break;
//	   case 4: 
//		   System.out.println("Wednesday");
//           break;
//	   case 5: 
//		   System.out.println("Thursday");
//           break;
//	   case 6: 
//		   System.out.println("Friday");
//           break;
//	   case 7: 
//		   System.out.println("Saturaday");
//           break;
//	
//	   default: 
//		   System.out.println("Invalid Input");
//	       break;
//	}
	
//	   System.out.println("Out of Switch");
	   
 

	}

}
