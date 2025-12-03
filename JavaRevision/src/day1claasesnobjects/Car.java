package day1claasesnobjects;

public class Car {

	public Car(String brand, String colour, int engineSize) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.engineSize = engineSize;
	}

	String brand;
	String colour;
	int engineSize;

	@Override
	public String toString() {
		return "brand=" + brand + ", colour=" + colour + ", engineSize=" + engineSize;
	}

}
