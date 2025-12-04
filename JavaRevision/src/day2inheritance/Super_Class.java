package day2inheritance;

public class Super_Class {

	int age = 20;

	double height;

	double weight;

	public Super_Class() {

	}

	public Super_Class(double height, double weight) {

		this.height = height;
		this.weight = weight;
	}

	public void displayAge() {
		System.out.println(age+" "+height+" "+weight);
	}

}
