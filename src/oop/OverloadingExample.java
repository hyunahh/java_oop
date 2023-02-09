package oop;

// 중복정의 규칙
// 메소드 이름을 똑같이 하면 정의하고자 할 때는 
// 매개변수 갯수나 데이터 타입이 반드시 달라야 한다.

class Calculater {

	// 메소드 Overloading(중복정의)
	public static int sum(int x, int y) {
		return x + y;
	}

	public static int sum(int x, int y, int z) {
		return x + y + z;
	}

	public static double sum(double x, double y) {
		return x + y;
	}

}

public class OverloadingExample {

	public static void main(String[] args) {
		System.out.println(Calculater.sum(10, 20));
		System.out.println(Calculater.sum(10.8, 20.9));
	}

}
