package abstraction.interface_test;

public interface SmartPhone extends MobileChipset{
	boolean  TOUCH_SUPPORT = true;
	
	void powerOn();
	void powerOff();
	void playGame();
	void useSocilaMedia();
	
//	@Override
//	default void cpuProcessing() {
//		// TODO Auto-generated method stub
//		System.out.println("Smartphone mounted with CPU");
//	}
	
	
	
	//not backward compatability
//	void mountedLens();
	
	default void mountedLens() {
		System.out.println("Supported Mounted len Features");
	}
	
	private void AIFeatures() {
		System.out.println("Using AI Features");
	}
	
	default void AICamera () {
		AIFeatures();
		System.out.println("Can shot Image and Video");
	}
	
	default void  AIAssiastant () {
	
		AIFeatures();
		System.out.println("Assit user for more convenient");
	}
	
	static void checkPhoneViaSize (double intches) {
		String status =(intches <5.5) ? "Phone Screen is small":
			(intches <8 ) ? "Phone Screen is big": "Not Phone just Tablet";
	
		System.out.println(status);
	}
       
}
