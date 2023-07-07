package abstraction.interface_test;

public class Xiaomi implements SmartPhone {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Xiaomi is powering on");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Xiaomi is powering off");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("Xiaomi can play Game");
	}

	@Override
	public void useSocilaMedia() {
		// TODO Auto-generated method stub
		System.out.println("Xiaomi can use social media");
	}


	@Override
	public void cpuProcessing() {
		// TODO Auto-generated method stub
		System.out.println(" Kirin Processing");
	}

	@Override
	public void gpuProcessing() {
		// TODO Auto-generated method stub
	
		System.out.println("Adreno990");
	}

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		System.out.println("DDR4 12 GB RAM");
	}

	@Override
	public void rom() {
		// TODO Auto-generated method stub
		System.out.println("SSD 256 ");
	}

}
