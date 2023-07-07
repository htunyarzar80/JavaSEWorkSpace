package enumeration;

public class PlanetMain {

	//command line args
	//java planetmain 100,200
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length !=1 ) {
			System.err.println("Argument length Exceeds to 1");
			System.exit(-1);
		}
		
		double earthWeight = Double.parseDouble(args[0]);
		//w = mg   m = w /g
		Planet earth= Planet.EARTH;
		double mass = earthWeight/earth.surfaceGravity();
		
		for(Planet planet : Planet.values())
			System.out.println("Weight on "+ planet+ " is "+planet.surfaceWeight(mass)+"kg");
	
	}
}
