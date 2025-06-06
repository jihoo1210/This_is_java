package This_is_java_1;

public class Type_of_variable {
	public static void main(String[] args) {
		//최댓값, 최소값 연산
		byte num1 = 125;
		int num2 = 125;
		for(int i = 0; i<5; i++) {
			num1 ++;
			num2 ++;
			System.out.println("num1 = " + num1 + "\t" + "num2 = " + num2);
		}
		//char_Unicode
		char c0 = 65; //65 = A
		char c1 = '\u0041'; //'(16진수)0041' = A
		System.out.println("c0 =" + c0 + "\t" + "c1 =" + c1);
		int unincode = c0; //유니코드 알기
		System.out.println("Unicde of A =" + unincode);
		// float and double
		float d0 = 0.1234567890123456789F;
		double d1 = 0.1234567890123456789;
		System.out.println("d0 =" + d0 + "\t" + "d1 =" + d1);
		//Change type
		byte e0 = 10;
		int e1 = e0; // byte->int - promotion
		int e2 = 200;
		float e3 = e2; //int->float - promotion
		char e4 = 'A';
		int e5 = e4; // char->int - promotion
		System.out.println("e1 =" + e1 + "\t" + "e3 =" + e3 + "\t" + "e5 =" + e5);
		int f0 = 123456789;
		byte f1 = (byte) f0; //int->byte - casting
		int g0 = 'A';
		char g1 = (char) g0; //int->char - casting
		double h0 = 3.14;
		int h1 = (int) h0; //double->int - casting
		System.out.println("f1 =" + f1 + "\t" + "g1 =" + g1 + "\t" + "h1 =" + h1);
		int i0 = 10;
		double i1 = 5.5;
		double result0 = i0 + i1;
		int result1 = i0 + (int)i1;
		System.out.println("result0 =" + result0 +"\t"+  "result1 =" + result1);
		byte j0 = 10;
		float j1 = 2.5F;
		double j2 = 2.5;
		//byte re0 = j0 + j0; 연산의 결과값은 int이므로 오류
		int re1 = 5 + j0;
		float re2 = 5 + j1;
		double re3 = 5 + j2;
		System.out.println(re1 + re2 + re3);
	}
}
