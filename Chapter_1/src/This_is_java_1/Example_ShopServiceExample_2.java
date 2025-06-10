package This_is_java_1;

public class Example_ShopServiceExample_2 {
	public static void main(String[] args) {
		Exmaple_ShopService_1 obj1 = Exmaple_ShopService_1.getInstance();
		Exmaple_ShopService_1 obj2 = Exmaple_ShopService_1.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 객체를 참조합니다.");
		} else {
			System.out.println("다른 객체를 참조합니다.");
		}
	}
}
