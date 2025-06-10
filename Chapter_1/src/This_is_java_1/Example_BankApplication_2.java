package This_is_java_1;

 import java.util.Scanner;
 
public class Example_BankApplication_2 {
	
	private static Example_ApplicationAcouunt_1[] accountArray = new Example_ApplicationAcouunt_1[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int count = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("------------------");
			System.out.print("입력: ");
			
			int selectNo = scanner.nextInt();
			scanner.nextLine();
			
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				desposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			} else {
				run = false;
			}
		}
			System.out.println("프로그램 종료.");
		}
		
	

	private static void createAccount() {
		System.out.println("------------------");
		System.out.println("1. 계좌 생성");
		System.out.println("------------------");
		System.out.print("계좌번호: ");
		String selectAno1 = scanner.nextLine();
		if (selectAno1.length() != 7) {
			System.out.println("하이픈을 포함한 7글자로 작성해주세요.");
			return;
		}
		System.out.print("계좌주: ");
		String selectOwner1 = scanner.nextLine();
		
		System.out.print("초기 입금액: ");
		int selectBalance1 = (int)scanner.nextInt();
		
		Example_ApplicationAcouunt_1 account = new Example_ApplicationAcouunt_1(selectAno1, selectOwner1, selectBalance1);
		System.out.println("계좌가 생성되었습니다.");
		accountArray[count++] = account;
}
	private static void accountList() {
		System.out.println("------------------");
		System.out.println("2. 계좌 목록");
		System.out.println("------------------");
				for(int i = 0; i < count; i++) {
			Example_ApplicationAcouunt_1 account =  accountArray[i];
			System.out.println(account.getAno() + "\t" + account.getOwner() +"\t" +  account.getBalance());
		}
		System.out.println("끝");
	}
	
	private static void desposit(){
		System.out.print("계좌 번호 입력: ");
		String ano = scanner.nextLine();
		Example_ApplicationAcouunt_1 account = findAccount(ano);
		if(account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
	        return; // 메소드 종료
		}
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		scanner.nextLine();
		account.setBalance(account.getBalance() + balance);
	}
	
	private static void withdraw(){
		System.out.print("계좌 번호 입력: ");
		String ano = scanner.nextLine();
		Example_ApplicationAcouunt_1 account = findAccount(ano);
		if(account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
	        return; // 메소드 종료
		}
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		scanner.nextLine();
		account.setBalance(account.getBalance() - balance);
	}
	
	private static Example_ApplicationAcouunt_1 findAccount(String ano) {
		for(int i = 0; i < count;  i++) {
			Example_ApplicationAcouunt_1 account =  accountArray[i];
			if(ano.equals(account.getAno())) {
				return account;
			} 
		}
		return null;
	}
}
