package oop;

public class StandardAPIExample {

	public static void main(String[] args) {
//		String message = "안녕하세요. 김현아입니다.";
		String message = new String("안녕하세요. 김현아입니다.");
		int count = message.length();

		System.out.println("총 " + count + "개의 문자로 구성되었습니다.");

		String ssn = new String("970612-1234567");
		char ch = ssn.charAt(7);
//		System.out.println(ch);
		switch (ch) {
		case '1':
			System.out.println("2000년 이전 출생 남자");
			break;
		case '2':
			System.out.println("2000년 이전 출생 여자");
			break;
		case '3':
			System.out.println("2000년 이후 출생 남자");
			break;
		case '4':
			System.out.println("2000년 이후 출생 여자");
			break;
		default:
			System.out.println("외국인");
		}

		int number = 12394067;
		String numStr = String.valueOf(number);
		int c = numStr.length();
		System.out.println(c);

		int n = -10;
		int result = Math.abs(n);
		System.out.println(result);

		double radian = 45.3;
		double re = 2 * Math.PI * radian;
		System.out.println(re);
	}

}
