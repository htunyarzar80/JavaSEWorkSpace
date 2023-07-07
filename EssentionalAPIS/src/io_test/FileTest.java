package io_test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\JavaSEWorkspace\\EssentionalAPIS\\src\\io_test\\textfile\\..\\..\\test4.write.txt");

		File relativeFile = new File("src/io_test/textfile/test4_write.txt");
		
	

//		System.out.println("File Exist ;" + relativeFile.exists());
//		System.out.println("Absolute Path :" + relativeFile.getAbsolutePath());
//		System.out.println("Canonical Path :"+file.getCanonicalPath());

		File textFileFolder = new File("src/io_test/textfile");
//		System.out.println("Folder Exists :"+textFileFolder.exists());

		System.out.println("Inside textFileFolder");
		for(String filename : textFileFolder.list()) {
			System.out.println(filename);
			
		}
		
		
//		System.out.println("File can be read :"+relativeFile.canRead());
//		System.out.println("File can be writen :"+relativeFile.canWrite());
//		System.out.println("File can be Executed  :"+relativeFile.canExecute());

//		System.out.println("RelativeFile Informations");
//
//		System.out.println("RelativeFile is Hidden? " + relativeFile.isHidden());
//		System.out.println("RelativeFile is directory? " + relativeFile.isDirectory());
//		System.out.println("RelativeFile is file? " + relativeFile.isFile());
//		System.out.println("RelativeFile is Absolute? " + relativeFile.isAbsolute());
//		System.out.println();
//
//		System.out.println("textfile Folder Informations");
//
//		System.out.println("textfile Folder is Hidden? " + textFileFolder.isHidden());
//		System.out.println("textfile Folder is directory? " + textFileFolder.isDirectory());
//		System.out.println("textfile Folder is file? " + textFileFolder.isFile());
//		System.out.println("textfile Folder is Absolute? " +textFileFolder .isAbsolute());
//		System.out.println();
		
		//drive information
		
//		System.out.println("Total Space : "+(textFileFolder.getTotalSpace()/(1024*1024*1024))+"GB");
//		System.out.println("Free Space : "+(textFileFolder.getFreeSpace()/(1024*1024*1024))+"GB");
//		System.out.println("Usable Space : "+(textFileFolder.getUsableSpace()/(1024*1024*1024))+"GB");
		
//		System.out.println("Separator : "+ relativeFile.separator);
		
//		Date date = new Date(textFileFolder.lastModified());
//		System.out.println("Last modified :"+date);
		
//		File newFile = new File("src/io_test/textfile/newFile.txt");
//		
//		if(newFile.exists()) {
//			System.out.println(newFile.getName()+"exists");
//			newFile.delete();
//			System.out.println(newFile.getName()+"is deleted");
//		}
//		
//		else {
//			System.out.println("File does not exist");
//			newFile.createNewFile();
//			System.out.println("Therefore, created :"+newFile.getName());
//		}
//		
	
//		File newFolder = new File("src/io_test/textfile/newFolder");
//		
//		if(newFolder.exists()) {
//			System.out.println(newFolder.getName()+"exists");
//		}else {
//			System.out.println("File does not exist");
//			newFolder.mkdir();//making directory
//			System.out.println("Therefore, created :"+newFolder.getName());
//		}
//		
	}

}
