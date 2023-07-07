package abstraction.interface_test;

public class XiaoMi12Ultra implements AndroidEcoSystem, SmartPhone,MobileOS{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("XiaomiMi12Ultra is powering on");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("XiaomiMi12Ultra is powering off");
		
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("XiaomiMi12Ultra can play games");
	}

	@Override
	public void useSocilaMedia() {
		// TODO Auto-generated method stub
		System.out.println("XiaomiMi12Ultra can use Soical Media");
		
	}

	@Override
	public void mountedLens() {
		// TODO Auto-generated method stub
		
		SmartPhone.super.mountedLens();
		System.out.println("XiaomiMi12Ultra can be mounted lens");
	}

	@Override
	public void cpuProcessing() {
		// TODO Auto-generated method stub
		System.out.println("Snapdragon 880 GEN 1");
	}

	@Override
	public void gpuProcessing() {
		// TODO Auto-generated method stub
	
		System.out.println("Adreno880");
	}

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		System.out.println("DDR4 12 GB RAM");
	}

	@Override
	public void rom() {
		// TODO Auto-generated method stub
		System.out.println("SSD 256GB");
	}

	@Override
	public void operateSmartPhone() {
		// TODO Auto-generated method stub
		System.out.println("MI-14 OS");
	}

	@Override
	public void system() {
		// TODO Auto-generated method stub
		System.out.println("Can use system");
	}


}
