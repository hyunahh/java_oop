package ezen.ams;

public class FileAccountRepository implements AccountRepository {

	@Override
	public int getCount() {
		return 0;
	}

	@Override
	public void addAccount(Account account) {

	}

	@Override
	public Account[] getAccounts() {
		return null;
	}

	@Override
	public Account findByNumber(String number) {
		return null;
	}

	@Override
	public boolean removeAccount(String number) {
		return false;
	}

}
