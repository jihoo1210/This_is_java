package This_is_java_1;

public interface Example_interface_1 {
	String sound();
}

class SoundableExample {
	private static void printSound(Example_interface_1 Example_interface_1) {
		System.out.println(Example_interface_1.sound());
	}
	
public static void main(String[] args) {
	printSound(new Cat());
	printSound(new Dog());
	}
}

class Cat implements Example_interface_1 {
	@Override
	public String sound() {
		String sound = "야옹";
		return sound;
	}
}

class Dog implements Example_interface_1 {
	@Override
	public String sound() {
		String sound = "멍멍";
		return sound;
	};
}