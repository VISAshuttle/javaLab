package sec07.exam05_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		Vehicle v = bus;
		driver.drive(v);
		
		driver.drive(bus);
		driver.drive(taxi);
		
	}

}
