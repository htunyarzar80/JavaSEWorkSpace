package javabasics;

public class BoxedTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intObj = /*new Integer(300)*/100;// Autoboxing
		System.out.println("IntObj :"+intObj);

		int x =10;
		Integer intObj2 =Integer.valueOf(x);// Manual boxing 
		System.out.println("IntObj2 :"+intObj2);
		
		int y = intObj; // Auto Unboxing
		System.out.println("y :"+y);
		
		int z = intObj2.intValue(); // manual unboxing
		System.out.println("z : "+z);
		
		System.out.println("Byte : "+Integer.BYTES);
		System.out.println("Size : "+Integer.SIZE);
		
		System.out.println("Binary : "+Integer.toBinaryString(45680));
		System.out.println("Hex : "+Integer.toHexString(45680));
		
		Character captialC ='C';
		char numeric9='9';
		System.out.println("Letter ?:"+Character.isLetter(captialC));
		System.out.println("Number ?:"+Character.isDigit(numeric9));
	}

}
