package ezen.car;

public class Car {
	
	// 필드의 다형성
	private Tire tire;

	public Car() {
	}

	public Car(Tire tire) {
		this.tire = tire;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public void run() {
		tire.roll();
		System.out.println("자동차가 달립니다.");
	}

}
