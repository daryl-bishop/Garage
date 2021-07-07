package garage;

import java.util.ArrayList;

public class Garage {
//create vehicle lists
	public ArrayList<Car> cars = new ArrayList<>();
	public ArrayList<Tractor> tractors = new ArrayList<>();
	public ArrayList<Snowplough> snowPloughs = new ArrayList<>();
	private Garage[] vehicle;

	// add and remove vehicles
	public void addCar(Car car) {
		this.cars.add(car);
	}

	public void removeCar(Car car) {
		this.cars.remove(car);
	}

	public void addTractor(Tractor tractor) {
		this.tractors.add(tractor);
	}

	public void removeTractor(Tractor tractor) {
		this.tractors.remove(tractor);
	}

	public void addSnowplough(Snowplough snowPlough) {
		this.snowPloughs.add(snowPlough);
	}

	public void removeSnowplough(Snowplough snowPlough) {
		this.snowPloughs.remove(snowPlough);
	}
	// create find by type fuction

	public Garage[] findByType(String name) {
		for (Garage type : this.vehicle) {
			if (vehicle.name == name) {
				return vehicle;
			}
		}
	}
}