package abstraction.interface_test;

public class Main {
	public static void main(String[] args) {
		
	
		SmartPhone xiaomiUltra = new XiaoMi12Ultra();
		xiaomiUltra.mountedLens();
		xiaomiUltra.AICamera();
		xiaomiUltra.AIAssiastant();
		xiaomiUltra.cpuProcessing();
		xiaomiUltra.gpuProcessing();
		xiaomiUltra.rom();
		xiaomiUltra.ram();
	
		if (xiaomiUltra instanceof XiaoMi12Ultra) {
		MobileOS xiaomiOS = (MobileOS) xiaomiUltra;
		xiaomiOS.operateSmartPhone();
		}
		
		if (xiaomiUltra instanceof XiaoMi12Ultra) {
			AndroidEcoSystem xiaomiEco = (AndroidEcoSystem) xiaomiUltra;
			xiaomiEco.system();
			}
			
//			SmartPhone iphone = new Iphone14();
//			iphone.powerOn();
//			iphone.powerOff();
//		    iphone.playGame();
//		    iphone.useSocilaMedia();
//		    
//		    SmartPhone huawei = new HuaweiMate30();
//			huawei.powerOn();
//			huawei.powerOff();
//		    huawei.playGame();
//		    huawei.useSocilaMedia();
//		    
//		    SmartPhone xiaomi = new Xiaomi();
//		    xiaomi.powerOn();
//		    xiaomi.powerOff();
//		    xiaomi.playGame();
//		    xiaomi.useSocilaMedia();
//
//		SmartPhone.checkPhoneViaSize(0);
//		System.out.println("Touch Screen :"+ SmartPhone.TOUCH_SUPPORT);
	}
	
}

