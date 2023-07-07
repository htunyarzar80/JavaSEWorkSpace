package nested_class;

import nested_class.Fackebook.VideoUploader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fackebook facebook = new Fackebook("quiz.mkv","MKV");
		facebook.upload();
		
		Tiktok tiktok = new Tiktok("dance.mp4","Mp4");
		tiktok.upload();
		
//		VideoUploader uploader = new VideoUploader();
//		uploader.upload();
		
		
//		ArithmeticOperations operations = new ArithmeticOperations(30,50, '*');
//		System.out.println(operations.getResult());

//		ArithmeticOperations operation = new ArithmeticOperations(50, 30);
//		ArithmeticOperations operation = new ArithmeticOperations();
//		
//		
//		ArithmeticOperations.Addition addition = operation.new Addition(80,100);
//		System.out.println(addition.add());
		
//		System.out.println(ArithmeticOperations.Addition.DATA_TYPE);
		
//		ArithmeticOperations.Subraction substraction = operation.new Subraction();
//		System.out.println(substraction.subtract());
//		
//		ArithmeticOperations.Mutiplication mutiplication = operation.new Mutiplication();
//		System.out.println(mutiplication.mutiply());
//		
//		ArithmeticOperations.Division dividion = operation.new Division();
//		System.out.println(dividion.divide());
//		
//		ArithmeticOperations.Modulo modulo = operation.new Modulo();
//		System.out.println(modulo.modulus());
//		
		
	}

}
