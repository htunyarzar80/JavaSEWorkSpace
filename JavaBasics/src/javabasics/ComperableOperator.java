package javabasics;

public class ComperableOperator {
	public static void main(String[] args) {
		         int a =100;
		         int b = 200;
		          boolean result1 = a <b;
		          System.out.println("Result 1 :"+ result1);
		 
		         double c = 2.55;
		         double d = 1.48;
			     boolean result2 = c<d;
			     System.out.println("Result 2 :"+ result2);
			 
			     char bigC= 'C';
			     char smallC= 'c';
				 boolean result3 = bigC>=smallC;
				 System.out.println("Result 3 :"+ result3);
				 
				 boolean flag1=true;
				 boolean flag2=false;
				 boolean result4 = flag1 != flag2;
				 System.out.println("Result 4:"+ result4);
			
				 
				 String name1= "mg mg";
				 String name2= "mg mg";
				 boolean result5 = name1==name2;
				 System.out.println("Result 5:"+ result5);
					
		
//		 System.out.println("10 is lt 20? "+ (10<20));
//		 System.out.println("10 is gt 20? "+ (10>20));
//		 System.out.println("10 is le 20? "+ (10<=20));
//		 System.out.println("10 is ge 20? "+ (10>=20));
//		 System.out.println("10 is eq 20? "+ (10==20));
//		 System.out.println("10 is nw 20? "+ (10!=20));
	}

}
