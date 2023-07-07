package model;

public class Customer {
	
	private Integer id;
	private String name;
	private String pw;
	private double amt;
	
	
	public Customer(String name, String pw, double amt) {
		super();
		this.name = name;
		this.pw = pw;
		this.amt = amt;
	}
	public Customer(Integer id, String name, String pw, double amt) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.amt = amt;
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
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", pw=" + pw + ", amt=" + amt + "]";
	}
	
	

}
