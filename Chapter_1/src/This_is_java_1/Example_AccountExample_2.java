package This_is_java_1;

public class Example_AccountExample_2 {

	public static void main(String[] args) {
		Example_Account_1 account = new Example_Account_1();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 = "+ account.getBalance());
		account.setBalance(-100);
		System.out.println("현재 잔고 = "+ account.getBalance());
		account.setBalance(9999999);
		System.out.println("현재 잔고 = "+ account.getBalance());
		account.setBalance(300000);
		System.out.println("현재 잔고 = "+ account.getBalance());

	}

}
