package JavaActivity1;

import JavaActivity1.java.activity.Car;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car toyota = new Car();
		toyota.make = 2014;
		toyota.color = "Black";
		toyota.transmission = "Manual";
		toyota.displayCharacteristics();
		toyota.accelarate();
		toyota.brake();
	}

}
