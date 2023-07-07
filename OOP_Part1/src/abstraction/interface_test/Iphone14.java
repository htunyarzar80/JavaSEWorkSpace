package abstraction.interface_test;

public class Iphone14 implements SmartPhone{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Iphone14 is powering on ");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Iphone14 is powering off ");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("Iphone14 can play game ");
	}

	@Override
	public void useSocilaMedia() {
		// TODO Auto-generated method stub
		System.out.println("Iphone14 can use Social media ");
	}

	@Override
	public void cpuProcessing() {
		// TODO Auto-generated method stub
		System.out.println("A16");
	}

	@Override
	public void gpuProcessing() {
		// TODO Auto-generated method stub
	
		System.out.println("Apple GPU");
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
