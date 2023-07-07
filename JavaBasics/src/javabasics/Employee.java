package javabasics;

public class Employee {
	
	int id;
	String name;
	String email;
    double salary;
    
    Employee(){
    	System.out.println("Inside no args constructor ");
  
    }
    
    Employee(int id, String name){
    	System.out.println("Inside no args constructor ");
    	
//    	this.id = Id;
//    	this.name = Name;
    }
    
    //all arguments constructor
    
    
    
    Employee(String email, double salary){
    	System.out.println("Inside no Args construtor: email, salary");
    	this.email = email;
    	this.salary= salary;
    	
    }
    	Employee (int id, String name, String email, double salary){
    		this(id, name);//recurise
    		System.out.println("Inside all args construtor ");
    		System.out.println(this);
    		
    		
    		this.email =email;
        	this.salary= salary;
    		
    	}
    
    

    void changeName(String name) {
    	this.name = name;
    }
	void updateEmployee(String name, String email, double salary) {
		this.changeName(name) ;
		this.email = email;
		this.salary = salary;
		
		
	}
}
