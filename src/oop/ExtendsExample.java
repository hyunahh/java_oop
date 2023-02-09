package oop;

public class ExtendsExample {

	public static void main(String[] args) {
		
		Parent parent = new Parent("홍길동", 50);
		System.out.println("부모이름:" + parent.getName());
		System.out.println("부모나이:" + parent.getAge());
		
		Child child = new Child("홍자식", 10, "이젠대학교");
		System.out.println(child.getName());
		System.out.println(child.getAge());
		
		child.song();
	}

}
