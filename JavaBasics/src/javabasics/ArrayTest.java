package javabasics;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3D
		//Month,Items,Quantity
		
		int [][][] cityBaseSellRecord = {
				//Yangon
				{
					
					//Jan,
					{
					   100,//laptop
					   300,//Phone
					   500,//PowerBank
					},
					//Feb
					{
						300,//laptop
						100,//Phone
						400,//PowerBank	
						
					},
					//Mar
					{
						600,//laptop
						200,//Phone
						700,//PowerBank	
						
					}
				},
				//Mandalay
				{
					//Jan,
					{
					20,//laptop
					80,//Phone
					400,//PowerBank
					},
					
					//Feb
					{
						300,//laptop
						100,//Phone
						400,//PowerBank	
						
					},
					
					//Mar
					{
						60,//laptop
						260,//Phone
						500,//PowerBank		
					}	
				}	
		};
		
		System.out.printf("Yangon Branch -Jan: Laptop =%d, Phone =%d, PowerBank= %d%n",
				cityBaseSellRecord[0][0][0],
				cityBaseSellRecord[0][0][1],
				cityBaseSellRecord[0][0][2]
				);
		System.out.printf("Yangon Branch -Feb: Laptop =%d, Phone =%d, PowerBank= %d%n",
				cityBaseSellRecord[0][1][0],
				cityBaseSellRecord[0][1][1],
				cityBaseSellRecord[0][1][2]
				);
		System.out.printf("Yangon Branch -Mar: Laptop =%d, Phone =%d, PowerBank= %d%n",
				cityBaseSellRecord[0][2][0],
				cityBaseSellRecord[0][2][1],
				cityBaseSellRecord[0][2][2]
				);
		
		System.out.printf("Mandalay Branch -Jan: Laptop =%d, Phone =%d, PowerBank= %d%n",
				cityBaseSellRecord[1][0][0],
				cityBaseSellRecord[1][0][1],
				cityBaseSellRecord[1][0][2]
				);
		System.out.printf("Mandalay Branch -Feb: Laptop =%d, Phone =%d, PowerBank= %d%n",
				cityBaseSellRecord[1][1][0],
				cityBaseSellRecord[1][1][1],
				cityBaseSellRecord[1][1][2]
				);
		System.out.printf("Mandalay Branch -Mar: Laptop =%d, Phone =%d, PowerBank= %d%n",
				cityBaseSellRecord[1][2][0],
				cityBaseSellRecord[1][2][1],
				cityBaseSellRecord[1][2][2]
				);
		
		//2D declare
		//Majors, Mark for one students
		//[roll index][column index]
		//object reference - row length * column length=9
		//row 0 = Mgmg
		//row 1 = MaSapal
		//row 3 = MgHein
		//column 0->Math
		//column 0->Math
		//column 0->Math
		//column 0->Math
//		int [][] studentMarks = new int[3][4];
//		
//		studentMarks[0][0]=140;
//		studentMarks[0][1]=180;
//		studentMarks[0][2]=170;
//		studentMarks[0][3]=190;
//		
//		//MaSapal
//		studentMarks[1][0]=150;
//		studentMarks[1][1]=160;
//		studentMarks[1][2]=160;
//		studentMarks[1][3]=100;
//		
//		//MaHein
//		studentMarks[2][0]=120;
//		studentMarks[2][1]=110;
//	    studentMarks[2][2]=100;
//	    studentMarks[2][3]=160;
		
//		int[][] studentMarks = {
//				{140,180,170,190},//MgMg
//				{150,160,160,100},//MaSapal
//				{120,110,100,160}};//Mghein
//		
//		System.out.printf("MgMg:Math= %d,LanguageArt=%d, literature=%d, Science = %d.%n",
//				studentMarks[0][0],studentMarks[0][1],studentMarks[0][2],studentMarks[0][3]
//				);
//		
//
//		System.out.printf("MaSapal:Math= %d,LanguageArt=%d, literature=%d, Science = %d.%n",
//				studentMarks[1][0],studentMarks[1][1],studentMarks[1][2],studentMarks[1][3]
//				);
//		
//
//		System.out.printf("MgHein:Math= %d,LanguageArt=%d, literature=%d, Science = %d.%n",
//				studentMarks[2][0],studentMarks[2][1],studentMarks[2][2],studentMarks[2][3]
//				);
//		
//		
		
		
		
//		String[] names = {"MgMg","AungAung","PhyuPhyu","NyoNyo"};
//		
//		System.out.println(names);
//		
//		System.out.println("Index 3:"+names[3]);
//		System.out.println(names.length);
//		
		
		
		//Declare 
		//0 to length -1
		//heap memory - refrence/address 5
//		int[] numArray =new int[5];
//		numArray[0] = 10;
//		numArray[1] = 20;
//		numArray[2] = 30;
//		numArray[3] = 40;
//		numArray[4] = 50;
		
		//initialize
//		int[] numArray = new int[] {10,20,30,40,50};
//	    int[] numArray = {10,20,30,40,50};
//		System.out.println(numArray);
//		System.out.println("Index 0: "+numArray [0]);
//		System.out.println("Index 1: "+numArray [1]);	
//		System.out.println("Index 2: "+numArray [2]);
//		System.out.println("Index 3: "+numArray [3]);


	
	
	}

}
