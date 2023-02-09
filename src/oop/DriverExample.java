package oop;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		Bus bus = new Bus();
		bus.run();

	}

}
