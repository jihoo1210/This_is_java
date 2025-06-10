package This_is_java_1;

public class Example_Account_1 {
	private int balance;
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	
	int setBalance(int balance) {
		if(0 > balance) {
			balance = getBalance();
		} else if(balance > 1000000 ) {
			balance = getBalance();
		} else {
			this.balance = balance;
		}
		return balance;
	}
	
	int getBalance() {
		return balance;
	}
	
	
}
