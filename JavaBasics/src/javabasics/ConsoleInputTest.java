package javabasics;

import java.util.Scanner;

public class ConsoleInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input nextLine() - statement next() - word
		
		Scanner userInput =new Scanner(System.in);
		System.out.println("Enter First Number?");
		
		int number1 = userInput.nextInt();
        System.out.println("Enter Second Number?");
        int number2 = userInput.nextInt();
		
        System.out.println("Enter Third Number?");
	    int number3 = userInput.nextInt();
		
		userInput.close();
		
		int result =(number1+number2+number3)/3;
		System.out.println("Result:"+result);
		
	}

}
