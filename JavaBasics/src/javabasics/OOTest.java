package javabasics;

public class OOTest {

	public static void main(String[] args) {
		
		//Vehicle object 2- color,gearType,...
	    Vehicle v1=new Vehicle();
	    
	    //Vechile object2 - color gearType
	    Vehicle v2=new Vehicle();
	    
	    v1.color="RED";
	    v1.speed=120;
	    v1.price=60000;
	    v1.manual=false;
	    v1.gearType='N';
	    
	    v1.color="yellow";
	    v1.speed=150;
	    v1.price=333400;
	    v1.manual=true;
	    v1.gearType='L';
	    
	    System.out.println("v1 address:"+v1);
		System.out.println("Color:"+ v1.color);
		System.out.println("Speed:"+v1.speed);
		System.out.println("Price:"+ v1.price);
		System.out.println("GearType:"+v1.gearType);
		System.out.println("Manual :"+v1.manual);

	    System.out.println("v2 address:"+v2);
		System.out.println("Color:"+ v2.color);
		System.out.println("Speed:"+v2.speed);
		System.out.println("Price:"+ v2.price);
		System.out.println("GearType:"+v2.gearType);
		System.out.println("Manual :"+v2.manual);
		
		v1.engineStart();
		v1.barke();
		
//		System.out.println("Color:"+new Vehicle().color);
//		System.out.println("Speed:"+new Vehicle().speed);
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
//		//Vehicle object -color, geartype
//		
//		Vehicle v1 = new Vehicle();
//		
//		//Vehicle object 2 -color geartype
//		
//		Vehicle v2 = new Vehicle();
//		
//		v1.color = "red";
//		v1.speed = 120;
//		v1.gearType='T';
//		v1.price =6000;
//		v1.manual = false;
//		
//		v2.color = "yellow";
//		v2.speed = 180;
//		v2.gearType='N';
//		v2.price =2000;
//		v2.manual = true;
//		
////		  System.out.println("Color : "+new Vehicle().color);
////		  System.out.println("Speed : "+new Vehicle().speed);
//		
//		  System.out.println("v1 address : "+v1);
//	 	  System.out.println("Price : "+v1.price);
//		  System.out.println("Speed : "+v1.speed);
//		  System.out.println("Color : "+v1.color);
//		  System.out.println("GearType : "+v1.gearType);
//		  System.out.println("Manual?: "+v1.manual);
//		  
//		  
//		  System.out.println("v1 address : "+v2);
//		  System.out.println("Price : "+v2.price);
//		  System.out.println("Speed : "+v2.speed);
//		  System.out.println("Color : "+v2.color);
//		  System.out.println("GearType : "+v2.gearType);
//		  System.out.println("Manual?: "+v2.manual);
//		  
//		  
//		  Vehicle.noOfWeels=3;
//		  System.out.println("No of Wheel: "+Vehicle.noOfWeels);
//		  
//		v1.engineStart();
//		v1.brake();
//		

	}

}
