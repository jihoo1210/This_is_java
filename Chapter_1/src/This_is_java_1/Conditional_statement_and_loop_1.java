package This_is_java_1;

public class Conditional_statement_and_loop_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// if 문
		// 0.0 <= Math.random(); < 1.0
		// 
		int num = (int)(Math.random()*20)+81;
		if (num >= 90) {
			System.out.println("90 이상.");
			if (num >= 95) {
				System.out.println("95 이상.");
			}
		}  else if (num > 80) {
			System.out.println("80 초과");
			if (num >= 85) {
				System.out.println("85 이상.");
			}
		}
		System.out.println(num);
		// switch 문
		char Grade = 'a';
		switch(Grade) {
			case 'A':
			case 'a':
			System.out.println("65");
			break;
			case 'B':
			case 'b':
			System.out.println("66");
			break;
			default:
			System.out.println("오류");
		}
		// for 문
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("----------------------------");
		// while 문
		int i = 1;
		int sum = 0;
		while( i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		boolean run = true;
		int speed = 0;
		int KeyCode = 0;
		
		while (run) {
			if (KeyCode != 13 && KeyCode != 10) {
				System.out.println("-----------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("-----------------");
				System.out.print("선택:  ");
			}
		
		
		KeyCode = System.in.read();
		
		if (KeyCode == 49) {
			speed += 1;
			System.out.println("현재 속도: " + speed);
		} else if (KeyCode == 50) {
			speed -= 1;
			System.out.println("현재 속도: " + speed);
		} else if (KeyCode == 51) {
			run = false;
		}
		}
		System.out.println("프로그램 종료");
		
		
	}
}
