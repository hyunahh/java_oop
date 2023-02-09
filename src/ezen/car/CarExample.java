package ezen.car;

public class CarExample {

	public static void main(String[] args) {
		Tire tire = new HankookTire();
		Car car = new Car(tire);
		car.run();
		car.setTire(new KumhoTire());
		car.run();
	}

}
