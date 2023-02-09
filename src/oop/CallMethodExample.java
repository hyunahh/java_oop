package oop;

/**
 * Call by value vs Call by reference
 * @author 김현아
 *
 */
public  class CallMethodExample {
	
	public static void doTask(int x) {
		x += 10;
		System.out.println(x);
	}
	public static void doTask2(Account account) {
		account.deposit(10000);
		System.out.println(account.getRestMoney());
	}
	
	public static void main(String[] args) {
		int i = 100;
		// Call by value
		doTask(i);
		System.out.println(i);
		
		Account account = new Account("1111-2222", "김현아", 1234, 100000);
		doTask2(account);
		
		System.out.println(account.getRestMoney());
	}

}
