package garage;

public class App {

	public static void main(String[] args) {
		Garage garage1 = new Garage();

		// adding cars
		Vehicle c1 = new Car("Ford", 3, "Black", 4);
		Vehicle c2 = new Car("BMW", 2, "Grey", 3);
		Vehicle c3 = new Car("Audi", 5, "Blue", 5);

		// adding tractors //weight in tons
		Vehicle t1 = new Tractor("Major", 12, "Blue", 20);
		Vehicle t2 = new Tractor("Ferguson", 5, "Red", 30);
		Vehicle t3 = new Tractor("Claas", 7, "Green", 25);

		// adding snowploughs // depth in inches
		Vehicle s1 = new Snowplough("Volvo", 23, "Black", 25);
		Vehicle s2 = new Snowplough("Dennis", 17, "Grey", 30);
		Vehicle s3 = new Snowplough("Scania", 27, "Brown", 28);

		garage1.addVehicle(c1);
		garage1.addVehicle(c2);
		garage1.addVehicle(c3);
		garage1.addVehicle(t1);
		garage1.addVehicle(t2);
		garage1.addVehicle(t3);
		garage1.addVehicle(s1);
		garage1.addVehicle(s2);
		garage1.addVehicle(s3);
		garage1.print();
		garage1.removeVehicle(s3);
		garage1.print();

		garage1.removeType("BMW");
		garage1.print();
	}

}