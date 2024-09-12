package day3task10;

public class Desktop implements HardWare , Software {

	@Override
	public void softwareResources() {
		System.out.println("softwareResources");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println("hardwareResources");
		
	}
	public static void main(String[] args) {
		
	
	Desktop san =new Desktop();
	san.softwareResources();
	san.hardwareResources();
	
	
	}
}
