package ezen.abstraction;

public class Cat extends Animal {
	
	public Cat(){
		
	}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void cry() {
		System.out.println("야옹");
	}

	@Override
	public void eat() {
		System.out.println("먹이를 냠냠 먹습니다.");
	}

}
