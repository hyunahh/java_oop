package ezen.abstraction;

public class HyunahExample {

	public static void main(String[] args) {

		Car car = new HyunahCar("현아차", "기아", false, 100);

		car.turnOn();
		car.turnOff();
		car.run();
		car.speedUp(100);
		car.speedDown(20);
		car.stop();

	}

}
