package This_is_java_1;

public class Example_MemeberService_2 {
	public static void main(String[] args) {
	Example_Member_1 memberService =  new Example_Member_1();
	boolean result = memberService.login("hong", "12345");
	if(result) {
		System.out.println("로그인 되었습니다.");
		memberService.logout("hong");
	} else {
		System.out.println("id 또는 password가 올바르지 않습니다.");
	}
	
	}
	}
