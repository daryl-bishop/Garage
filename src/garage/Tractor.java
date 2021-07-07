package garage;

public class Tractor extends Vehicle {
	public int towWeight;

	public Tractor(String model, int age, String colour, int towWeight) {
		super(model, age, colour);

		// extra attributes
		// weight it can tow

		this.setTowWeight(towWeight);
	}

	public int getTowWeight() {
		return towWeight;
	}

	public void setTowWeight(int towWeight) {
		this.towWeight = towWeight;
	}

	// repair cost
	public double repairCost() {
		return 40.00;

	}
}
