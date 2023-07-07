package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.DBConnection;

public class StudentDAO {

	private Connection connection;
	private Statement stmt;
	private PreparedStatement pStmt;
	private ResultSet rs;
	
	private void close() {
		if (connection !=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//Read R 
	public List<Student> getAllStudents(){
		List<Student> studentList = new ArrayList<>();
		connection = DBConnection.getConnection();
		
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from student;");
			
			while (rs.next()) {
				studentList.add(new Student(
						
						rs.getInt("id"),
						rs.getString("name"), 
						rs.getString("major"),
						rs.getString("code"),
						rs.getDouble("gpa")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				
			close();
		}
		return studentList;
	}
	
	//create c
	public int createStudent (Student student) {
		int rowEffected =0;
		connection = DBConnection.getConnection();
		
		try {
			pStmt = connection.prepareStatement("INSERT INTO `student` "
					+ "(`name`, `major`, `code`, `gpa`) "
					+ "VALUES (?, ?, ?, ?);"
					);
			pStmt.setString(1, student.getName());
			pStmt.setString(2, student.getMajor());
			pStmt.setString(3, student.getCode());
			pStmt.setDouble(4, student.getGpa());
			rowEffected = pStmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return rowEffected;
	}
}
