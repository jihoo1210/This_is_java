package This_is_java_1;

public class Operations {
 public static void main(String[] args) {
	 //부호 연산자
	 int a1 = -10;
	 int a2 = -a1;
	 int a3 = +a1;
	 System.out.println("a2 = " + a2 + "\t" + "a3 = "+ a3);
	 //증감 연산자
	int a4 = 10;
	int a5;
	a5 = a4++;
	System.out.println(a5);
	a5 = ++a4;
	System.out.println(a5);
	//논리 부정 연산자
	boolean a6 = true;
	System.out.println(!a6);
	//비트 반전 연산자
	int a7 = 10;
	int a8 = ~a7;
	System.out.println(a8);
	//산술 연산자
	int b1 = 10;
	int b2 = 4;
	int b3 = b1/b2;
	double b4 = b1/b2;
	double b5 = (double)b1/b2;
	System.out.println("b3 = " + b3 + "\t" + "b4 = "+ b4 + "\t" + "b5 = "+ b5);
	char b6 = 'A' +1;
	char b7 = (char)(b6 + 1);
	System.out.println(b7);
}
}
