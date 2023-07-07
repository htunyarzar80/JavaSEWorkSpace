package controller;

import java.util.Scanner;

import model.Student;
import model.StudentDAO;

public class StudentController {
	
	private static final StudentDAO STUDENT_DAO = new StudentDAO();
	
	public static void main(String[] args) {
		
		System.out.println("Choose Your Operation :");
		System.out.println("1.List 2.Create 3.update 4.Delete 5.Search");
		Scanner userInput = new Scanner(System.in);
		int status = userInput.nextInt();
		
		switch (status) {
		case 1 -> showStudentList();
		case 2 -> createStudent();
		default -> System.out.println("Unsupported Operations");
		
		}
	}

	static void showStudentList() {
		STUDENT_DAO.getAllStudents().forEach(System.out :: println);
	}
	
	static void createStudent() {
		System.out.println("Enter Student Information");
		Scanner studentInput = new Scanner(System.in);
		
		System.out.println("Enter Student Name :");
		String name =studentInput.next();
		System.out.println("Enter Student Major :");
		String major =studentInput.next();
		System.out.println("Enter Student Code :");
		String code =studentInput.next();
		System.out.println("Enter Student Gpa:");
		double gpa =studentInput.nextDouble();
		
		studentInput.close();
		
		Student student = new Student(name, major, code, gpa);
		int rowEffected = STUDENT_DAO.createStudent(student);
		
		String result = rowEffected > 0? "Created!" : "Fail to create";
		
		System.out.println(result);
		
	}
}
