package ezen.ams;

import java.util.List;

public class AMSExample2 {

	public static void main(String[] args) {
		System.out.println("애플리케이션 시작됨");
		//ListAccountRepository repository = new ListAccountRepository();
		MapAccountRepository repository = new MapAccountRepository();
		// 신규계좌 등록
		Account account = new Account("1111-2222-3333", "홍길동", 1234, 100000);
		repository.addAccount(account);
		System.out.println("신규계좌 등록 완료!");
		repository.addAccount(new Account("2222-3333-4444", "박지성", 1111, 10000));
		System.out.println("신규계좌 등록 완료!");
		repository.addAccount(new MinusAccount("3333-4444-5555", "김대출", 1111, 10000, 10000000, "2023.1.9"));
		System.out.println("신규계좌 등록 완료!");

		// 전체계좌 조회
		List<Account> list = repository.getAccounts();
		for (Account acc : list) {
			System.out.println(acc);
		}

		// 계좌이름으로 계좌 검색
		System.out.println("-------계좌 검색-------");
		Account findAccount = repository.findByNumber("1111-2222-3333");
		if (findAccount != null) {
			System.out.println("검색된 계좌: " + findAccount);
			try {
//				findAccount.withdraw(1000000);
				findAccount.withdraw(-1000000);
			} catch (NotSufficientBalnceException e) {
				// 사용자에게 오류메시지 출력
				// System.out.println((e.getMessage());
				System.out.println(e.toString());
			}
		} else {
			System.out.println("검색된 계좌가 존재하지 않습니다.");
		}
		
		// 계좌 삭제 이거안됨
		if(repository.removeAccount("2222-3333-4444")) {
			System.out.println("삭제완료");
		} else {
			System.out.println("계좌가 존재하지 않습니다.");
		}
		System.out.println("애플리케이션 종료됨");
	}

}
