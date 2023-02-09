package ezen.array;

import oop.Account;

/**
 * @author 김현아 2023. 1. 2. 계좌 저장소 객체 여러개의 계좌를 저장하고 관리(추가, 읽기, 검색, 수정, 삭제)하는 역할의
 *         클래스
 */
public class AccountRepository {
	// 다형성 Up casting
	private Account[] accounts;
	private int count;

	public int getCount() {
		return count;
	}

	public AccountRepository() {
		this(10);
	}

	public AccountRepository(int capacity) {
		this.accounts = new Account[capacity];
	}

	public Account[] getAccounts() {
		return accounts;
	}

	// 계좌 등록 기능
	public void addAccount(Account account) {
		accounts[count++] = account;
	}

	// 계좌 검색 기능
	public Account findByNumber(String number) {
		for (int i = 0; i < count; i++) {
			String an = accounts[i].getAccountNumber();
			// 동일 계좌 번호 여부 확인
			if (an.equals(number)) {
				return accounts[i];
			}
		}
		return null;
	}

	// 계좌 삭제 기능
	public boolean removeAccount(String number) {
		for (int i = 0; i < count; i++) {
			String an = accounts[i].getAccountNumber();
			// 동일 계좌 번호 여부 확인
			if (an.equals(number)) {
				for (int j = i; j < count - 1; j++) {
					accounts[j] = accounts[j + 1];
				}
				count--;
				return true;
			}
		}
		return false;
	}

}
