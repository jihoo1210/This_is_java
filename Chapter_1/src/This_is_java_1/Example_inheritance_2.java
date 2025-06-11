package This_is_java_1;

public class Example_inheritance_2 extends Example_inheritance_1{
	//필드 생성
	private String name;
	
	// 생성자 생성
	public Example_inheritance_2() {
		this("홍길동");
		System.out.println("Example_inheritance_2() call");
	}
	
	public Example_inheritance_2(String name) {
		//super()자동 생성 -> Example_inheritance_1()
		this.name = name;
		System.out.println("Example_inheritance_2(String name) call");
	}
}
