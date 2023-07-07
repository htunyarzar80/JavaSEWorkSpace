package io_test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import javax.print.Doc;

public class SerDeSerTest {
	
	static void serializedDoctor () throws FileNotFoundException, IOException {
		
		System.out.println("Inside SerializedDoctor");
		
		Doctor.workHour= 12;
		
		Doctor doctor = new Doctor(1011, "DrKyaw", 40, "Cardiologist");
		System.out.println("Before Deserialization :");
		System.out.println(doctor);
		
		//serialization
		
		ObjectOutputStream out = new ObjectOutputStream(
			    new BufferedOutputStream(new FileOutputStream("doctor.ser"))
				);
		out.writeObject(doctor);
		out.close();
		System.out.println("Doctor object is serilized ");
		
	}
	
	static void deserializedDoctor() throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("Inside deserializedDoctor");
		
		ObjectInputStream input = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("doctor.ser"))
				);
		
		Doctor doctor = (Doctor) input.readObject();
		input.close();
		System.out.println("After deserialization :");
		System.out.println(doctor);
		
		
	}
	
	public static void main(String[] args) {
		
//		try {
//			serializedDoctor();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			deserializedDoctor();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
