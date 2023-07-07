package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ResourceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File ("C:\\test file\\test.txt");
		 
		Scanner fileReader = null;
		try {
			 fileReader = new Scanner(file);
			
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				System.out.println(line);	
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("Inside finally block");
			
			if (fileReader != null)
			fileReader.close();
			
			System.out.println("Scanner is closed");
			
		}

	}

} 


