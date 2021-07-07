package garage;

public class Vehicle {

	private String model;

	private int age;

	private String colour;

	public Vehicle() {
		super();
	}

	public Vehicle(String model, int age, String colour) {
		super();
		this.setModel(model);
		this.setAge(age);
		this.setColour(colour);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void print() {
		System.out.println("Model: " + getModel());
		System.out.println("Age: " + getAge());
		System.out.println("Colour: " + getColour());
		System.out.println("Repair Cost: £" + repairCost());
	}

	public double repairCost() {

		return 50;
	}

}
