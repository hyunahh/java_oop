
package ezen.interfacee;

public interface RemoteControl {

	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;

	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

	// Java8부터 디폴트 메소드 추가
	public default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}

	}

	// static 메소드 추가
	public static void changeBattery() {
		System.out.println("배터리를 교환합니다.");
	}
}
