package This_is_java_1;

public class Exmaple_ShopService_1 {
	private static Exmaple_ShopService_1 ShopService = new Exmaple_ShopService_1();
	
	private Exmaple_ShopService_1() {};
	
		public static Exmaple_ShopService_1 getInstance() {
			return ShopService;
		};
}
