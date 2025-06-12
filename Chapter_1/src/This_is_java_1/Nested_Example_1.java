package This_is_java_1;

public class Nested_Example_1 {
	class Tire {};
	static class Engine {};
}

class NestedClassExample {
	public static void main(String[] args) {
		Nested_Example_1 Car = new Nested_Example_1();
		
		Nested_Example_1.Tire tire =  Car.new Tire();
		
		Nested_Example_1.Engine engine = new Nested_Example_1.Engine();
	}
}

interface Vehicle {
	public void run();
}

class Anonymous {
	Vehicle field = new  Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}

class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(
				new Vehicle() {
					@Override
					public void run() {
						System.out.println("트럭이 달립니다.");
				}
			}
		);
	}
}
