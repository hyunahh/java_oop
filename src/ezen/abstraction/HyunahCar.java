package ezen.abstraction;

public class HyunahCar extends Car {

	public HyunahCar() {
	}

	public HyunahCar(String name, String model, boolean status, int speed) {
		this.name = name;
		this.model = model;
		this.status = status;
		this.speed = speed;
	}

	@Override
	public void turnOn() {
		System.out.println("시동을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	@Override
	public void run() {
		System.out.println("현아가 달립니다.");

	}

	@Override
	public void speedUp(int speed) {
		System.out.println("속도를 " + speed + " 올립니다.");
	}

	@Override
	public void speedDown(int speed) {
		System.out.println("속도를 " + speed + " 내립니다.");
	}

	@Override
	public void stop() {
		System.out.println("현아가 멈춥니다.");

	}
}
