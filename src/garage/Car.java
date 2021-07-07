package garage;

public class Car extends Vehicle {

	public int numberOfDoors;

	public Car(String model, int age, String colour, int numberOfDoors) {
		super(model, age, colour);

		// extra attributes
		// number of doors

		this.setNumberOfDoors(numberOfDoors);
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
}
