package day2inheritance;

public class Main extends Smartphone {

	public static void main(String[] args) {

		Main mobile1 = new Main();
		mobile1.brand = "Google";
		mobile1.processor = "Tensor G4";
		mobile1.ram = 8;
		mobile1.storage = 64;
		
		System.out.println(mobile1);
		
		mobile1.calling();
		mobile1.takingImage();

	}

}
