package oop;

/**
 * @author 김현아 현실세계의 객체를 프로그램으로 표현하기 은행계좌 추상화 객체 추상화 객체지향 프로그래밍의 4대 특징: 1. 추상화
 *         2. 캡슐화 3. 상속 4. 다형성
 */
// 클래스에 선언하는 접근제한자: 생략, public
public class Account {
	// 은행이름(상수)
	public static final String BANK_NAME = "EZEN_BANK";
	// 객체의 속성(정보)들을 저장하기 위한 변수 선언 = 필드
	// 인스턴스 변수들
	// 필드에 선언할 수 있는 접근제한자: private, 생략(default), protected, public
	// 캡슐화(은닉화)
	private String accountNumber;
	private String accountOwner;
	private int password;
	private long restMoney;

	// 디폴트 생성자
	// 생성자 오버로딩(Overloading): 중복정의
	public Account() {
//		this.accountNumber = null;
//		this.accountOwner = null;
//		this.password = 0;
//		this.restMoney = 0L;
		this(null, null);
	}

	public Account(String accountNumber, String accountOwner) {
//		this.accountNumber = accountNumber;
//		this.accountOwner = accountOwner;
//		this.password = 0;
//		this.restMoney = 0L;
		this(accountNumber, accountOwner, 0, 0L);
	}

	public Account(String accountNumber, String accountOwner, int password, long restmoney) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.password = password;
		this.restMoney = restmoney;
	}// 디폴트생성자, 매개변수생성자 총 두개 만들기->setter/getter->기능**

	// 완벽한 캡슐화를 위해 setter/getter 메소드 정의

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public long getRestMoney() {
		return restMoney;
	}

	public void setRestMoney(long restMoney) {
		this.restMoney = restMoney;
	}

	// 객체의 행위(동작)를 정의하기 위한 인스턴스 메소드들
	// 입금기능
	public long deposit(long money) {
		restMoney += money;
		return restMoney;
	}

	// 출금기능
	public long withdraw(long money) {
		restMoney -= money;
		return restMoney;
	}

	// 비밀번호 확인 기능
	public boolean checkPassword(int passwd) {
		return password == passwd;
	}

	// 모든정보 출력기능
	@Override
	public String toString() {
		return accountNumber + "\t" + accountOwner + "\t" + "****" + "\t" + restMoney;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Account)) {
			return false;
		}
		Account account = (Account) obj;
		if (account.toString().equals(toString())) {
			return true;
		}
		return false;
	}

	/*
	 * @Override public boolean equals(Object obj) { Account account = (Account)
	 * obj; String accNumber = account.getAccountNumber(); if
	 * (accountNumber.equals(accNumber)) { String accOwnner =
	 * account.getAccountOwner(); if (accOwnner.equals(accountOwner)) { int passwd =
	 * account.getPassword(); if (passwd == password) { long money =
	 * account.getRestMoney(); if (money == restMoney) { return true; } } return
	 * true; } } return false; }
	 */
}
