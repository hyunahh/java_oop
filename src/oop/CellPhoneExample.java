package oop;

public class CellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("삼성", "검정", 10);

		System.out.println("모델:" + dmbCellPhone.getModel());
		System.out.println("색상:" + dmbCellPhone.getColor());
		System.out.println("채널:" + dmbCellPhone.getChannel());

		dmbCellPhone.sendVoice("하이");
		dmbCellPhone.reciveVoice("빠이");
		dmbCellPhone.changeChannel(9);
		dmbCellPhone.turnOffDmb();

	}

}
