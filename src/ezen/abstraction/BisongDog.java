package ezen.abstraction;

public class BisongDog extends Dog {

	public BisongDog() {

	}

	public BisongDog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void eat() {
		System.out.println("게걸스럽게 먹습니다.");

	}

}
