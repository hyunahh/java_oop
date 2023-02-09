package ezen.abstraction;

/**
 * 모든 자동차들이 구현해야 하는 추상메소드를 선언한 추상클래스
 * 
 * @author 김현아
 * @date 2023. 1. 6.
 */
public abstract class Car {
	protected String name;
	protected String model;
	protected boolean status;
	protected int speed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

//추상메소드(수직적 명세)
	public abstract void turnOn();

	public abstract void turnOff();

	public abstract void run();

	public abstract void speedUp(int speed);

	public abstract void speedDown(int speed);

	public abstract void stop();
}