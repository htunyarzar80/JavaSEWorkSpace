package io_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CharactorStringIOTest {
	
	static String dir1 = "src/io_test/textfile/test1.txt";
	static String dir2 = "src/io_test/textfile/test2.write.txt";
	static String dir3 = "src/io_test/textfile/test3.write.txt";
	static String dir4 = "src/io_test/textfile/test4.write.txt";
	
	static void readFileWithScanner() {
		System.out.println("Inside readFileWithScanner");
		File file = new File(dir4);
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(scanner!= null ) {
				scanner.close();
			}
			
		}
	}
	
	static void writeFileWithPrintWiriter() {
		System.out.println("Inside writeFileWithPrintWriter");
		File file = new File(dir4);
		
		PrintWriter writer = null;
		
		try {
		
		     writer = new PrintWriter (file);
		     writer.printf("%d.%s.%d.\n",1,"MGMG",300000);
		     writer.printf("%d.%s.%d.\n",1,"TOE",400000);
		     writer.printf("%d.%s.%d.\n",1,"TUN",500000);
		     writer.printf("%d.%s.%d.\n",1,"MYA",200000);
		     writer.printf("%d.%s.%d.\n",1,"MOE",600000);
		     
		     System.out.println("test 4_write.txt is wrote");   
	
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(writer != null ) {
				writer.close();
			}
		}
	}
	
	static void writeFileWithBuffer() {
		System.out.println("Inside writeFileWithBuffer");
		File file = new File(dir3);
		
		BufferedWriter writer = null;
		try {
		     writer = new BufferedWriter(new FileWriter(file));
		     
		     writer.write("This is Line number  1.\r\n");
		     
		     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(writer != null) {
				try {
					writer .close();
					System.out.println("Closed BufferWriter");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	static void writeFileWithoutBuffer() {
		System.out.println("Inside writeFileWithoutBuffer");
		File file = new File(dir2);
		
		FileWriter writer = null;
		try {
		     writer = new FileWriter(file);
		     char a = 'a';
		     char b= 'b';
		     char c ='%';
		     writer.write(a);
		     writer.write(b);
		     writer.write(c);
		     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(writer != null) {
				try {
					writer .close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	static void readFileWithBuffer() {
		System.out.println("Inside readFileWithBuffer");
		File file = new File(dir1);
		
		FileReader reader = null;
		BufferedReader  bufferedReader =null;
		
		try {
		    reader = new FileReader(file);
			bufferedReader = new BufferedReader(reader);
			
			String readLine = "";
			
			while ((readLine = bufferedReader.readLine()) !=null){
				System.out.println((readLine));
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	static void readFileWithoutBuffer() {
		System.out.println("Inside readFileWithoutBuffer");
		File file = new File(dir1);
		
		FileReader reader = null;
		try {
		    reader = new FileReader(file);
			
			int readChar = 0;
			while ((readChar = reader.read()) !=-1){
				System.out.print((char)readChar+" ");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		readFileWithoutBuffer();
//		readFileWithBuffer();
//		writeFileWithoutBuffer();
//		writeFileWithBuffer();

	writeFileWithPrintWiriter();
		
//		readFileWithScanner();
	}

}
