package enumeration;

public enum Planet {
	
	MERCURY(3.303e23,2.4397e6),
	VENUS(4.869e24,6.0518e6),
	EARTH(5.976e24,6.37814e6),
	MARS(6.421e23,3.3972e6),
	JUPITER(1.9e27,7.1492e7),
	SATURN(5.688e26,6.0268e7),
	URANUS(8.686e25,2.5559e7),
	NEPTUNE(1.024e26,2.4746e7);
	
	private final double mass;
	private final double radius;
	private Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
	}
	public double getMass() {
		return mass;
	}
	public double getRadius() {
		return radius;
	}
	
	public static final double G= 6.67300E-11;
	
	//g
	public double surfaceGravity() {
		return G*mass/(radius*radius);
		
	}

	//w
	public double surfaceWeight(double mass) {
		return mass * surfaceGravity();//w = mg
		
		
	}

}














