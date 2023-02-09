package ezen.inner;

public class Outer3 {

	String name;

	public void doTask() {
		final int x = 10;

		System.out.println("doTask() 메소드 실행");

		// 지역 내부클래스
		class Helper {
			public void someDo() {
				System.out.println("someDo() 메소드 실행");
				name = "오잉";
				System.out.println(x); //지역변수 접근할때 final로 접근
			}
		}

		Helper helper = new Helper();
		helper.someDo();
	}

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.doTask();
	}
}
