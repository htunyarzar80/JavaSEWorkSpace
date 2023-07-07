package io_test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamIOTest {
	static String inputDir = "src/io_test/image/fruit.jpg";
	static String outputDir = "src/io_test/copy/fruit_copy.jpg";

	
	static void copyImageFileWithBuffer() {
		System.out.println("Inside copyImageFileWithBuffer");
		
		File inputFile = new File(inputDir);
		File outputFile = new File(outputDir);
		
		if (inputFile.exists()) {
			System.out.println("File Size : "+inputFile.length()+"bytes");
			
			FileInputStream inputStream = null;
			FileOutputStream outputStream= null;
			
			BufferedInputStream bufferedInput = null;
			BufferedOutputStream bufferedOutput = null;
			
			long startTime = System.currentTimeMillis();
			long elapsedTime = 0;
			
			try {
				inputStream = new FileInputStream(inputFile);
			    outputStream= new FileOutputStream(outputFile);
				
			    bufferedInput= new BufferedInputStream(inputStream);
			    bufferedOutput= new BufferedOutputStream(outputStream);
				
			    int readByte=0;
				
			    byte[] buffer = new byte[4000];
			    
				while ((readByte = bufferedInput.read(buffer)) !=-1) {
				bufferedOutput.write(buffer, 0, buffer.length);	
				}
				
				System.out.println("File is successfully written!");
				elapsedTime = System.currentTimeMillis()-startTime;
				System.out.println("Elapsed time : "+elapsedTime+"Ms");
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(inputStream != null && outputStream != null ) {
					
					try {
						inputStream.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						outputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Input and Output Stream are closed.");
				}
			}
			
		}
		 
	}
	
	static void copyImageFileWithoutBuffer() {
		System.out.println("Inside copyImageFileWithoutBuffer");
		
		File inputFile = new File(inputDir);
		File outputFile = new File(outputDir);
		
		if (inputFile.exists()) {
			System.out.println("File Size : "+inputFile.length());
			
			FileInputStream inputStream = null;
			FileOutputStream outputStream= null;
			
			long startTime = System.currentTimeMillis();
			long elapsedTime = 0;
			
			try {
				inputStream = new FileInputStream(inputFile);
			    outputStream= new FileOutputStream(outputFile);
				
				int readByte=0;
				
				while ((readByte = inputStream.read()) !=-1) {
				outputStream.write(readByte);	
				}
				
				System.out.println("File is successfully written!");
				elapsedTime = System.currentTimeMillis()-startTime;
				System.out.println("Elapsed time : "+elapsedTime+"Ms");
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(inputStream != null && outputStream != null ) {
					
					try {
						inputStream.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						outputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Input and Output Stream are closed.");
				}
			}
			
		}
		 
//		System.out.println("File Size : "+ inputFile.);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		copyImageFileWithoutBuffer();
	

		copyImageFileWithBuffer();
	}

}
