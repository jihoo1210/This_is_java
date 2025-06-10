package This_is_java_1;

public class Example_Member_1 {
	String name;
	String id;
	String password;
	int age;
	Example_Member_1(){};
	Example_Member_1(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	boolean login(String name, String id){
		boolean run = false;
		if(name.equals("hong") && id.equals("12345")) {
			run = true;
		 }
		return run;}
	
	void logout(String name) {
		if(name.equals("hong")) {
			System.out.println("로그아웃 되었습니다.");
		}
	}
	
}
