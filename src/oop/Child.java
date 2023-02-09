package oop;

public class Child extends Parent {
//	String name;
//	int age;
// 추가 필드
	private String schoolName;

	public Child() {}

	public Child(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}

	public Child(String name, int age) {
		super(name, age);
	}

	// 메소드 추가
	public void song() {
		System.out.println("노래를 부릅니다.");
	}
}
