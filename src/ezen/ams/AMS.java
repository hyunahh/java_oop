
package ezen.ams; //바이트스트림 객체스트림

import java.util.Calendar;
import java.util.Scanner;

public class AMS {

	private static AccountRepository repository = new ArrayAccountRepository(100);
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("::::: " + Account.BANK_NAME + " 계좌 관리 애플리케이션 :::::");
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				// 계좌 생성
				createAccount();
			} else if (selectNo == 2) {
				// 계좌목록
				accountList();
			} else if (selectNo == 3) {
				// 입금
				// 입금하고자는 계좌번호 받기...
				// 입금금액 받기
				deposit();
			} else if (selectNo == 4) {
				// 출금
				// 출금하고자는 계좌번호 받기...
				// 출금금액 받기
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("※ 등록 계좌종류 선택");

		System.out.println("------------------------------");
		System.out.println("1.입출금계좌 | 2.마이너스계좌");
		System.out.println("------------------------------");
		System.out.print("선택> ");

		Account account = null;

		int accountType = Integer.parseInt(scanner.nextLine());
		System.out.print("계좌번호: ");
		String num = scanner.nextLine();

		System.out.print("예금주: ");
		String owner = scanner.nextLine();

		System.out.print("비밀번호: "); // 런타임 -로직 바꾸기 isDigit 숫자
		int passwd = Integer.parseInt(scanner.nextLine());

		System.out.print("초기 입금액: ");
		long money = Long.parseLong(scanner.nextLine());

		long rentMoney = 0L;
		String rentDate = null;
		if (accountType == 1) {
			account = new Account(num, owner, passwd, money);
		} else if (accountType == 2) {
			System.out.print("대출금액: ");
			rentMoney = Long.parseLong(scanner.nextLine());
			System.out.print("대출일자: "); // Calendar로 바꾸기
			Calendar today = Calendar.getInstance();
			account = new MinusAccount(num, owner, passwd, money, rentMoney, rentDate);
		}
		// 계좌등록
		repository.addAccount(account);
		System.out.println("※ 계좌를 정상 등록하였습니다.");
	}

	// 계좌목록보기 format으로 바꾸기
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("계좌종류     계좌번호     예금주     잔액     대출금액      대출일자");
		System.out.println("---------------------------------------------------------------------");
		Account[] list = repository.getAccounts();
		for (int i = 0; i < repository.getCount(); i++) {
			Account account = list[i];
			if (account instanceof MinusAccount) {
				System.out.println("마이너스계좌   " + account.getAccountNumber() + "    " + account.getAccountOwner()
						+ "     " + account.getRestMoney());
			} else {
				System.out.println("입출금계좌   " + account.getAccountNumber() + "    " + account.getAccountOwner()
						+ "     " + account.getRestMoney());
			}

		}
	}

	// 동일계좌 찾기
//	private static Account findByNumber(String Number) {
//		for (int i = 0; i < ano.length(); i++) {
//			if (Number[i] != null)
//				if (Number[i].getAno().equals(Number)) {
//					account = Number[i];
//				}
//		}
//		return account;
//	}

	// 예금
	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int dep = scanner.nextInt();

		if (repository.getAccounts(ano) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {
			findAccount(ano).setBalance(findAccount(ano).getBalance() + dep);
			System.out.println("결과: 입금이 성공되었습니다.");
		}
		
	}

	// 출금
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int withd = scanner.nextInt();

		if (AccountNumber(ano) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {
			if (withd > findAccount(ano).getRestMoney()) {
				System.out.println("잔액보다 큰 액수를 입력하셨습니다.");
			} else {
				findAccount(ano).setRestMoney(withd);
				System.out.println("결과: 출금이 성공되었습니다.");
			}
		}
	}

}
