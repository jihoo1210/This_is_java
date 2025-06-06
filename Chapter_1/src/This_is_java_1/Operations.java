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
	//문자열 연결 연산자
	String e1 = "String" + 1.0;
	String e2 = e1 + 5;
	System.out.println(e2);
	String e3 = 3 + 3.0 + "String";
	String e4 = "String" + 3 + 3.0;
	System.out.println("e3 = " + e3  + '\t' +  '\t' + "e4 = " + e4);
	//비교 연산자
	char f1 = 'A';
	char f2 = 'B';
	System.out.println( f1 > f2);
	String f3 = "jihoo";
	String f4 = new String("jihoo");
	System.out.println(f3 == f4);
	System.out.println(f3.equals(f4));
	// 논리 연산자
	int g1 = 10;
	int g2 = 5;
	System.out.println("-----------------");
	System.out.println(g1 > g2 && g1 < g2);
	System.out.println(g1 > g2 || g1 < g2);
	System.out.println(g1 > g2 ^ g1 < g2);
	System.out.println(g1 > g2 && !(g1 < g2));
	// ---
	// 비트 연산자
	System.out.println(45 & 25);
	System.out.println(45 | 25);
	System.out.println(45 ^ 25);
	System.out.println(~45);
	System.out.println(5 << 3);
	System.out.println(5 >> 3);
	System.out.println(-5 >>> 3);
	//대입 연산자
	char h1 = 10;
	h1 |= 5;
	System.out.println((int)h1);
	System.out.println(h1);
}
}