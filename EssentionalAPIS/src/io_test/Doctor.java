package io_test;

import java.io.Serializable;

public class Doctor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4402292414811013382L;
//	private static final long serialVersionUID = 1L;
	
	static int workHour;
	
	private int id;
	private String name;
	private transient int age; //trasient vairable
	
	private String field;                                                                              
	

	public static int getWorkHour() {
		return workHour;
	}


	public static void setWorkHour(int workHour) {
		Doctor.workHour = workHour;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

//

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Doctor(int id, String name, int age, String field) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.field = field;
	}


	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", age=" + age + ", field=" + field +",workHour="+workHour+ "]";
	}
	
	
}
