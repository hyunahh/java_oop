package ezen.interfacee;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl remocon = new Television();
		remocon.turnOn();
		remocon.setVolume(5);
		// 인터페이스의 디폴트 메소드 재사용
		remocon.setMute(true);
		remocon.setMute(false);
		Television tv = (Television) remocon;
		System.out.println("현재볼륨:" + tv.getVolume());
		remocon.setVolume(100);
		remocon.turnOff();
		RemoteControl.changeBattery();

		remocon = new Audio();
		remocon.turnOn();
		remocon.setVolume(5);
		remocon.setMute(true);
		remocon.setMute(false);
		Audio audio = (Audio) remocon;
		System.out.println("현재볼륨:" + audio.getVolume());
		remocon.setVolume(100);
		remocon.turnOff();
		RemoteControl.changeBattery();
	}

}
