package ezen.abstraction;

public class Bird extends Animal {
	
	public Bird() {
	}
	
	public Bird(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void cry() {
		System.out.println("짹짹");
	}

	@Override
	public void eat() {
		System.out.println("먹이를 쪼아 먹습니다.");
	}

	// 새로운 기능 추가
	public void fly() {
		System.out.println("새가 날아갑니다.");
	}

}
