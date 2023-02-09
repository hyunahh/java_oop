package ezen.ams;

public class AMS2 {

	public static void main(String[] args) {
		
		AccountRepository repository = new ArrayAccountRepository(100);
		// 가상(테스트)데이터 등록

		repository.addAccount(new Account("1111-2222", "김기정", 1111, 100000));
		repository.addAccount(new MinusAccount("1111-3333", "김현아", 1111, 500000, 1000000, "2023.1.16"));

		AccountFrame frame = new AccountFrame(Account.BANK_NAME + "AMS", repository);
		frame.initLayout();
		frame.addEventListener();
		frame.setSize(600, 400);
		frame.setVisible(true);
	}

}
