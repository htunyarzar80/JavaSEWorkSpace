package object_class;

import java.util.Objects;

public class Student {
	
	private int id;
	private String name;
	private String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String major) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, major, name);
	}
	@Override                                                   
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(major, other.major) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + "]";
	}
	
	
	
	

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		String objectStr ="[id="+id+",name="+name+",major="+major+"]";
//		return objectStr ;
//	}
//	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		int hashcode = id*name.length()*major.length();
//		return hashcode;
//	}
//	@Override
//	public boolean equals(Object otherStudent) {
//		// TODO Auto-generated method stub
//		return (this.hashCode() == otherStudent.hashCode());
//	}
}
