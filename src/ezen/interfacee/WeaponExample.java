package ezen.interfacee;

public class WeaponExample {

	public static void main(String[] args) {
		
//		Weapon weapon = new Weapon();
		// 인터페이스는 타입으로 선언 가능, 생성X
		// 자동형변환, 다형성
		Weapon weapon = new Gun();
		weapon.attack();
		
		weapon = new Sword();
		weapon.attack();
		
		weapon = new Club();
		weapon.attack();
	}

}
