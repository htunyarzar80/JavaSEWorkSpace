 package generic;

public class Student  implements Comparable<Student>{

	private Integer id;
	private String name;
	private String major;
	public Student(Integer id, String name, String major) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + "]";
	}
	@Override
	public int compareTo(Student otherStudent) {
		// TODO Auto-generated method stub
		return this.id >= otherStudent.id?this.id==otherStudent.id?0:1:-1;
	}
	
	
}
