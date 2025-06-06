package This_is_java_1;
import java.util.Scanner;

public class Conditional_statement_and_loop_2 {
	//do-while
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("'q'입력시 종료됩니다.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		//break
		// 0 <= (int)(Math.random()*6) < 6
		while(true) {
			int num = (int)(Math.random()*6)+1;
			if(num < 6) {
				System.out.println(num);
			} else {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		Outter: for(int i = 1; i < 5; i++) {
			System.out.println(i);
			if(i == 3) {
				System.out.println("Outter을 종료합니다.");
				break Outter;
			}
		}
		
		
	}
}
