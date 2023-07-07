package model;

public class Student {
	
	private Integer id;
	private String name;
	private String major;
	private String code;
	private double gpa;
	public Student(String name, String major, String code, double gpa) {
		super();
		this.name = name;
		this.major = major;
		this.code = code;
		this.gpa = gpa;
	}
	
	
	public Student(Integer id, String name, String major, String code, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.code = code;
		this.gpa = gpa;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + ", code=" + code + ", gpa=" + gpa + "]";
	}
	
	
	

}
