package garage;

import java.util.ArrayList;

public class Garage {

//create vehicle lists
	ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}

	public void print() {
		for (Vehicle v : this.vehicles) {
			v.print();

		}
	}

	// repair cost

	public double repairCost() {
		for (Vehicle vehicle : vehicles) {
			double bill = 0 + repairCost();
			return bill;

		}
		return 0.0;

	}

//find by
	public void removeType(String model) {
		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i).getModel() == model) {
				this.vehicles.remove(vehicles.get(i));

			} else {
			}
		}
	}
}
