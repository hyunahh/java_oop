package oop;

public class Bird extends Animal {
	
	@Override
	public void cry() {
		System.out.println("짹짹");
	}
	
	// 새로운 기능 추가
	public void fly() {
		System.out.println("새가 날아갑니다.");
	}

}
