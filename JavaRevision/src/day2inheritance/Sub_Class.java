package day2inheritance;

public class Sub_Class extends Super_Class {

	int age;

	public Sub_Class(int age, double height, double weight) {
		super(height, weight);
		this.age = age;
	}

	public void displayAge() {
		System.out.println(age+" "+height+" "+weight);
		super.displayAge();
	}

	public static void main(String[] args) {

		Sub_Class person1 = new Sub_Class(24, 75.2, 6.1);
		person1.displayAge();
	}

}
