package This_is_java_1;

public interface Example_interface_3 {
	void work();
}

class ActionExample {
	public static void main(String[] args) {
		Example_interface_3 action = new Example_interface_3() {
			@Override
			public void work() {
				System.out.println("복사를 시작합니다");
			}
		};
		
		action.work();
	}
}
