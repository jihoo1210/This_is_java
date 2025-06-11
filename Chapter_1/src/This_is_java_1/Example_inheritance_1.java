package This_is_java_1;

public class Example_inheritance_1 {
	//필드 선언
	public String nation;
	
	// 생성자 선언
	public Example_inheritance_1() {
		this("대한민국");
		System.out.println("Example_inheritance_1 call");
	}
	public Example_inheritance_1(String nation) {
		this.nation = nation;
		System.out.println("Example_inheritance_1(String nation) call");
	}
}
