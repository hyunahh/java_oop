package ezen.ams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * AccountRepository 인터페이스 구현 클래스
 * 
 * @author 김현아
 * @date 2023. 1. 9.
 */
public class MapAccountRepository {

	private Map<String, Account> accounts;

	public MapAccountRepository() {
		accounts = new Hashtable<>();
	}

	public void addAccount(Account account) throws RuntimeException {
		if (accounts.containsKey(account.getAccountNumber())) {
			throw new RuntimeException("이미 등록된 계좌입니다.");
		} else {
			accounts.put(account.getAccountNumber(), account);
		}
	}

	public List<Account> getAccounts() {
		return new ArrayList<>(accounts.values());
	}

	public Account findByNumber(String number) {
		return accounts.get(number);
	}

	public boolean removeAccount(String number) {
		Account removeAccount = accounts.remove(number);
		if (removeAccount != null) {
			return true;
		}
		return false;
	}
}
