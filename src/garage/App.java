package garage;

public class App {

	public static void main(String[] args) {

	}

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

	Person found = manager.findByName("Daryl");

	if(found!=null)
	{
		found.print();
	}else
	{
		System.out.println("Manager doesn't exist with that name");
	}
}
