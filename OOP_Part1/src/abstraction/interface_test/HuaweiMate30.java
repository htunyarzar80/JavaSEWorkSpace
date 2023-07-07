package abstraction.interface_test;

public class HuaweiMate30 implements SmartPhone {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("HuaweiMate30 is powering on ");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("HuaweiMate30 is powering off ");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("HuaweiMate30 can play Game ");
	}

	@Override
	public void useSocilaMedia() {
		// TODO Auto-generated method stub
		System.out.println("HuaweiMate30 can use Soical Media ");
	}

	@Override
	public void cpuProcessing() {
		// TODO Auto-generated method stub
		System.out.println(" Kirin990 Processing");
	}

	@Override
	public void gpuProcessing() {
		// TODO Auto-generated method stub
	
		System.out.println("Adreno660");
	}

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		System.out.println("DDR4 8 GB RAM");
	}

	@Override
	public void rom() {
		// TODO Auto-generated method stub
		System.out.println("SSD ");
	}

	
}
