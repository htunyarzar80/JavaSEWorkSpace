package selfstudy;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Your Pattern : Number");
		int pattern = userInput.nextInt();
		userInput.close();
		
//		for (; i <= 4; i++)  {
//			for (int j = 1; j <= 12; j++)  {
//				System.out.format("%d * %d = %d\n",i ,j, i*j);
//			}
//			System.out.println();
//		}

		for (int i= 1; i <= 5; i++) {
			for(int j = 1; j<=i;j++) 
				System.out.print("*");
				System.out.println();
			
			
	}
		
	}
}
