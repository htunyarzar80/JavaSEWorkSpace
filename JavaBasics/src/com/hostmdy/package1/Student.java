package com.hostmdy.package1;

//POJO Class -> Plain Ordinary Object
/*public private*/ class Student {
	
	/*public*/public int id;
	/*public*/public String name;
	/*public*/public  String major;
	
	public Student () {}
	/*public private*/ Student(int id, String name, String major) {
		super();
//		this.id = id;
//		this.name = name;
//		this.major = major;
		
		setId(id);
		setName(name);
		setMajor(major);
	}
	public int getId() {
		if (id >0)
		    return id;
		else
			return-1;
		
	}
	public void setId(int id) {
		
		if(id >0)
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
	
//	/*public*/ void printDetails() {
//		System.out.println("Id :"+this.id);
//		System.out.println("Name :"+name);
//		System.out.println("Major :"+major);
		
	}


