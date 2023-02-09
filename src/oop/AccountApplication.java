package oop;


/**
 * @author 김현아 자바 애플리케이션 실행을 위한 '애플리케이션 클래스' 메인클래스라고도 합니다.
 */
public class AccountApplication {
	// 애플리케이션의 엔트리포인트(실행진입점)
	public static void main(String[] args) {
		System.out.println("애플리케이션 시작됨");

		// 기본데이터타입 변수 선언 및 할당
		int age = 50;
		System.out.println("나이:" + age);

		// 참조변수 선언 및 인스턴스 할당(객체 생성)
		Account account;
		account = new Account();
		// 메모리에 생성된 인스턴스(객체)의 필드와 메소드 사용
//		account.accountNumber = "1111-2222-3333";
		account.setAccountNumber("1111-2222-3333");
//		account.accountOwner = "김현아";
		account.setAccountOwner("김현아");
//		account.restMoney = 1000000L;
		account.setRestMoney(1000000L);
//		account.password = 1234;
		account.setPassword(1234);

		System.out.println(account.getAccountNumber());
		System.out.println(account.getAccountOwner());
		System.out.println(account.getRestMoney());
		System.out.println(account.getPassword());

		// 인스턴스 메소드 사용(호출)
		boolean confirm = account.checkPassword(1234);
		if (confirm) { // 비밀번호 일치 시
			long restMoney = account.deposit(100000);
			System.out.println("입금 후 잔액: " + restMoney);
			restMoney = account.withdraw(100000);
			System.out.println("출금 후 잔액: " + restMoney);
			restMoney = account.getRestMoney();
			System.out.println("현재 잔액: " + restMoney);
		} else { // 비밀번호 불일치 시
			System.out.println("비밀번호를 다시 확인하여 주세요");
		}

		// 하나의 클래스로부터 여러개의 인스턴스 생성할 수 있다.
		Account account2 = new Account();
		// 인스턴수 변수는 생성과 동시에 JVM에 의해 자동 초기화 된다.
		// boolean(false), byte, short, int, long(0), float, double(0.0), char(0)
		// cf) 지역변수는 자동초기화 X
		// double weight = 0.0;
		// System.out.println(weight);

		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getRestMoney());

//		account2.accountNumber = "2222-3333-4444";
		account2.setAccountNumber("2222-3333-4444");
//		account2.restMoney = 100000L;
		account2.setRestMoney(100000L);

		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getRestMoney());

		// 생성자 테스트
		Account account3 = new Account("3333-4444-5555", "홍길동", 1234, 100000);
		System.out.println(account3.getRestMoney());

		Account account4 = new Account("4444-5555-6666", "박지성");
		
		System.out.println(Account.BANK_NAME);

		System.out.println("애플리케이션 종료됨");
	}

}
