package day2inheritance;

public class Smartphone {

	String brand;
	String processor;
	int ram;
	int storage;

	public void calling() {
		System.out.println("Making call");
	}

	public void takingImage() {
		System.out.println("Taking image");
	}

	@Override
	public String toString() {
		return "Smartphone [brand=" + brand + ", processor=" + processor + ", ram=" + ram + ", storage=" + storage
				+ "]";
	}

}
