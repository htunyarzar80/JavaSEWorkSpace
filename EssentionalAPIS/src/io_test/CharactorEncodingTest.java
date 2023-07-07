package io_test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharactorEncodingTest {
	
	
	static void encodingDetails(String charactor) {
		System.out.println("Encoding details of "+charactor+": ");
		
		try {
			System.out.println("US-ASCII : "+Arrays.toString(charactor.getBytes("US-ASCII")));
			System.out.println("UTF-8 : "+Arrays.toString(charactor.getBytes("UTF-8")));
			System.out.println("ISO-8859-1 : "+Arrays.toString(charactor.getBytes("ISO-8859-1")));
			System.out.println("UTF-16 : "+Arrays.toString(charactor.getBytes("UTF-16")));
			System.out.println("UTF-16BE : "+Arrays.toString(charactor.getBytes("UTF-16BE")));
			System.out.println("UTF-16LE : "+Arrays.toString(charactor.getBytes("UTF-16LE")));
			System.out.println();
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		encodingDetails("a");
		encodingDetails("%");
		encodingDetails("€");
		encodingDetails("£");

		
	}

	
}
