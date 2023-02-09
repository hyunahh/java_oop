package oop;

public class CellPhone {
	private String model;
	private String color;

	public CellPhone() {
		this(null, null);
	}

	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//기능
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	public void sendVoice(String message) {
		System.out.println(message + "을(를) 전송합니다.");
	}

	public void reciveVoice(String message) {
		System.out.println(message + "을(를) 수신합니다.");
	}

	public void handUP() {
		System.out.println("전화를 끊습니다.");
	}

}
