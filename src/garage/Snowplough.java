package garage;

public class Snowplough extends Vehicle {

	public int ploughDepth;

	public Snowplough(String model, int age, String colour, int ploughDepth) {
		super(model, age, colour);

		// extra attributes
		// depth it can plough

		this.setPloughDepth(ploughDepth);
	}

	public int getPloughDepth() {
		return ploughDepth;
	}

	public void setPloughDepth(int towWeight) {
		this.ploughDepth = towWeight;
	}

}
